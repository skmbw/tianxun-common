package com.vteba.tianxun.utils.image;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.vteba.utils.charstr.ByteUtils;

public class ImageUtils {
	private static final Logger LOGGER = LogManager.getLogger(ImageUtils.class);
	
	/**
	 * 按指定宽度等比例缩放图片，高度按比例计算
	 * 
	 * @param imageFile
	 * @param newPath
	 * @param newWidth
	 *            新图的宽度
	 * @throws IOException
	 */
	public static void zoomScale(File imageFile, String newPath,
			int newWidth) throws IOException {
		if (imageFile == null || !imageFile.canRead()) {
			return;
		}
		BufferedImage bufferedImage = ImageIO.read(imageFile);
		if (bufferedImage == null) {
			return;
		}

		double originalWidth = bufferedImage.getWidth();
		int originalHeight = bufferedImage.getHeight();
		double scale = originalWidth / newWidth; // 缩放的比例
		int newHeight = (int) (originalHeight / scale);
		zoom(imageFile, newPath, bufferedImage, newWidth, newHeight);
	}

	/**
	 * 生成缩略图
	 * @param imageFile
	 * @param newPath
	 * @param bufferedImage
	 * @param width
	 * @param height
	 * @throws IOException
	 */
	private static void zoom(File imageFile, String newPath,
			BufferedImage bufferedImage, int width, int height)
			throws IOException {

		String suffix = imageFile.getName().toLowerCase();
		suffix = suffix.substring(suffix.lastIndexOf(".") + 1);

		// 处理 png 背景变黑的问题
		if (suffix.endsWith("png") || suffix.endsWith("gif")) {
			BufferedImage to = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics2D g2d = to.createGraphics();
			to = g2d.getDeviceConfiguration().createCompatibleImage(width,
					height, Transparency.TRANSLUCENT);
			g2d.dispose();
			
			g2d = to.createGraphics();
			Image from = bufferedImage.getScaledInstance(width, height,
					Image.SCALE_AREA_AVERAGING);
			g2d.drawImage(from, 0, 0, null);
			g2d.dispose();
			
			ImageIO.write(to, suffix, new File(newPath));
		} else {
			BufferedImage newImage = new BufferedImage(width, height,
					bufferedImage.getType());
			Graphics g = newImage.getGraphics();
			g.drawImage(bufferedImage, 0, 0, width, height, null);
			g.dispose();
			ImageIO.write(newImage, suffix, new File(newPath));
		}
	}
	
	/**
	 * 生成缩略图
	 * @param imageFile
	 * @param newPath
	 * @param bufferedImage
	 * @param width
	 * @param height
	 * @throws IOException
	 */
	public static void zoom(byte[] imageBytes, String newPath, int width, int height, String format)
			throws IOException {

		ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
		BufferedImage bufferedImage = ImageIO.read(bais);
		try {
			if (height == 0) {
				double originalWidth = bufferedImage.getWidth();
				int originalHeight = bufferedImage.getHeight();
				double scale = originalWidth / width; // 缩放的比例
				height = (int) (originalHeight / scale);
			}
			
			if ("png".equalsIgnoreCase(format) || "gif".equalsIgnoreCase(format)) {
				BufferedImage to = new BufferedImage(width, height,
						BufferedImage.TYPE_INT_RGB);
				Graphics2D g2d = to.createGraphics();
				to = g2d.getDeviceConfiguration().createCompatibleImage(width,
						height, Transparency.TRANSLUCENT);
				g2d.dispose();
				
				g2d = to.createGraphics();
				Image from = bufferedImage.getScaledInstance(width, height,
						Image.SCALE_AREA_AVERAGING);
				g2d.drawImage(from, 0, 0, null);
				g2d.dispose();
				
				ImageIO.write(to, format, new File(newPath));
			} else {
				BufferedImage newImage = new BufferedImage(width, height,
						bufferedImage.getType());
				Graphics g = newImage.getGraphics();
				g.drawImage(bufferedImage, 0, 0, width, height, null);
				g.dispose();
				ImageIO.write(newImage, format, new File(newPath));
			}
		} catch (Exception e) {
			LOGGER.error("缩略图写本地文件异常，", e);
		} finally {
			IOUtils.closeQuietly(bais);
		}
	}
	
	/**
	 * 生成缩略图
	 * @param imageFile
	 * @param newPath
	 * @param bufferedImage
	 * @param width
	 * @param height
	 * @throws IOException
	 */
	public static byte[] zoom(byte[] imageBytes, int width, int height, String format)
			throws IOException {

		ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
		BufferedImage bufferedImage = ImageIO.read(bais);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			if (height == 0) {
				double originalWidth = bufferedImage.getWidth();
				int originalHeight = bufferedImage.getHeight();
				double scale = originalWidth / width; // 缩放的比例
				height = (int) (originalHeight / scale);
			}
			
			if ("png".equalsIgnoreCase(format) || "gif".equalsIgnoreCase(format)) {
				BufferedImage to = new BufferedImage(width, height,
						BufferedImage.TYPE_INT_RGB);
				Graphics2D g2d = to.createGraphics();
				to = g2d.getDeviceConfiguration().createCompatibleImage(width,
						height, Transparency.TRANSLUCENT);
				g2d.dispose();
				
				g2d = to.createGraphics();
				Image from = bufferedImage.getScaledInstance(width, height,
						Image.SCALE_AREA_AVERAGING);
				g2d.drawImage(from, 0, 0, null);
				g2d.dispose();
				
				
				ImageIO.write(to, format, baos);
			} else {
				BufferedImage newImage = new BufferedImage(width, height,
						bufferedImage.getType());
				Graphics g = newImage.getGraphics();
				g.drawImage(bufferedImage, 0, 0, width, height, null);
				g.dispose();
				ImageIO.write(newImage, format, baos);
			}
			byte[] result = baos.toByteArray();
			return result;
		} catch (Exception e) {
			LOGGER.error("缩略图片返回字节数组错误，", e);
		} finally {
			IOUtils.closeQuietly(bais);
			IOUtils.closeQuietly(baos);
		}
		return ByteUtils.ZERO;
	}
	
	/**
	 * 按固定尺寸缩放图片
	 * 
	 * @param imageFile
	 * @param newPath
	 * @param width
	 * @param height
	 * @throws IOException
	 */
	public static void zoomScale(File imageFile, String newPath, int width,
			int height) throws IOException {
		if (imageFile == null || !imageFile.canRead()) {
			return;
		}
		BufferedImage bufferedImage = ImageIO.read(imageFile);
		if (bufferedImage == null) {
			return;
		}
		zoom(imageFile, newPath, bufferedImage, width, height);
	}

	/**
	 * 线性等比例改变图片尺寸
	 * @param imageFile
	 * @param newPath
	 * @param width
	 *            新图片的宽度
	 * @throws IOException
	 */
	public static void linearScale(File imageFile, String newPath, int width)
			throws IOException {
		if (imageFile == null || !imageFile.canRead()) {
			return;
		}
		AffineTransform transform = new AffineTransform();
		BufferedImage bis = ImageIO.read(imageFile);
		int w = bis.getWidth();
		int h = bis.getHeight();
		int nh = (width * h) / w;
		double sx = (double) width / w;
		double sy = (double) nh / h;
		transform.setToScale(sx, sy);
		AffineTransformOp ato = new AffineTransformOp(transform, null);
		BufferedImage bid = new BufferedImage(width, nh, BufferedImage.TYPE_3BYTE_BGR);
		ato.filter(bis, bid);

		ImageIO.write(bid, "jpeg", new File(newPath));
	}
}
