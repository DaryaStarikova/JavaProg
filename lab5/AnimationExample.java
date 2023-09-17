package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

public class AnimationExample extends JPanel {

    private BufferedImage[] frames;
    private int currentFrameIndex;
    private Timer timer;

    public AnimationExample() {
        try {
            // Загрузка изображения с анимацией
            URL imageURL = getClass().getResource("animation_frames3.jpg");
            BufferedImage fullImage = ImageIO.read(imageURL);

            // Разделение изображения на кадры
            int numFrames = 4;  // Количество кадров
            int frameWidth = fullImage.getWidth() / numFrames;
            int frameHeight = fullImage.getHeight();
            frames = new BufferedImage[numFrames];

            for (int i = 0; i < numFrames; i++) {
                frames[i] = fullImage.getSubimage(i * frameWidth, 0, frameWidth, frameHeight);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        currentFrameIndex = 0;

        // Создание таймера для анимации (смена кадров)
        int delay = 100;  // Задержка между кадрами в миллисекундах
        timer = new Timer(delay, e -> {
            currentFrameIndex = (currentFrameIndex + 1) % frames.length;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(frames[currentFrameIndex], 0, 0, this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Animation Example");
            AnimationExample animationExample = new AnimationExample();
            frame.add(animationExample);
            frame.setSize(animationExample.frames[0].getWidth(), animationExample.frames[0].getHeight());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }
}



