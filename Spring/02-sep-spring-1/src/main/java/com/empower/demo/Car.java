package com.empower.demo;

public class Car {
	private Audio audio;		//loose coupled because, either Sony/ Jbl can be injected

	public Car() {}

	public Car(Audio audio) {
		super();
		this.audio = audio;
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}
	
	public void playMusic()
	{
		audio.play();
	}
}
