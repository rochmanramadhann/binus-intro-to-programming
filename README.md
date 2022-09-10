# Binus University

This repository includes all of my personal homework for my university, especially for the Intro to Programming Course.

## Installation

I'm using [chocolatey](https://chocolatey.org/install) for the package manager. This package manager allows me to install all the necessary developer tools on Windows. You can install it by run the following command on Powershell and also using an Administrative Shell.

```bash
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
```

There are some package and developer tools installed by using chocolatey, which are:
- [Java SE 8.0.211](https://community.chocolatey.org/packages/jdk8)
- [Visual Studio Code 1.71.0](https://community.chocolatey.org/packages/vscode)
- [Git 2.37.3](https://community.chocolatey.org/packages/git)

## Clone Repository

```bash
git clone https://github.com/rochmanramadhann/binus-intro-to-programming.git
```

## Running Single File

```java
java FileName.java

javac FileName.class
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)