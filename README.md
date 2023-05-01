# 🐶 Dog age Calculator

## Description

This is a simple calculate dog age. It takes the age of a dog in human years and calculate it to dog years.

## Propuse this project

- Learn the basics of `edn` files
- Learn the basics of clojure CLI
- Learn the basics to run a minimal clojure project with tests

## Project structure

```bash
.
├── README.md
├── deps.edn
├── src
│   ├── core.clj
│   └── dogs_years_old.clj
└── test
    └── dogs_years_old_test.clj

3 directories, 5 files
```

## Usage

After clone this repository, ans obviously have clojure installed, run the following command in the terminal:

```
clj -M -m core

Enter in the dog's 🐶 name:
# ...
```

## Tecnical especificacions

clojure -version

    Clojure CLI version 1.11.1.1273

java Version

    openjdk 19.0.1 2022-10-18
    OpenJDK Runtime Environment (build 19.0.1+10-21)
    OpenJDK 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)

Extra dependencies in `deps.edn` file.

### Run tests

```bash
clj -M:test
```

This must be the output:

```bash
Running tests in #{"test"}

Testing dogs-years-old-test

Ran 6 tests containing 6 assertions.
0 failures, 0 errors.
```

Make with ❤️ and ☕️ by [Aristóteles Coutinho](https://aristotelescoutinho.com.br)