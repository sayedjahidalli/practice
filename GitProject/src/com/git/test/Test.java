package com.git.test;

import com.git.bean.GitClient;

public class Test {

	public static void main(String[] args) {
		GitClient client=new GitClient();
		System.out.println(client.get());
	}
}
