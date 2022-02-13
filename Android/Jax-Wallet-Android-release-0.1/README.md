[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/AlphaWallet/alpha-wallet-android)

# JAX Wallet - Advanced, Open Source Ethereum Mobile Wallet & dApp Browser for Android

[![Build Status](https://api.travis-ci.com/AlphaWallet/alpha-wallet-android.svg?branch=master)](https://api.travis-ci.com/AlphaWallet/alpha-wallet-android.svg?branch=master)
[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg )](https://github.com/AlphaWallet/alpha-wallet-android/graphs/commit-activity)
![GitHub contributors](https://img.shields.io/github/contributors/AlphaWallet/alpha-wallet-android.svg)
[![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/AlphaWallet/alpha-wallet-android/blob/master/LICENSE)
[![codecov](https://codecov.io/gh/AlphaWallet/alpha-wallet-android/branch/master/graph/badge.svg)](https://codecov.io/gh/AlphaWallet/alpha-wallet-android)

JAX Wallet is an open source programmable blockchain apps platform.

JAX Wallet has been used by JAX.

⭐ Star us on GitHub — it helps!

<a href='https://play.google.com/store/apps/details?id=io.stormbird.wallet&hl=en&utm_source=github-readme&pcampaignid=pcampaignidMKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1'><img alt='Get AlphaWallet Open Source Wallet on Google Play' src='https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png' height="100"/></a>

## About JAX Wallet - Features

Easy to use and secure open source Ethereum wallet for Android and iOS, with native ERC20, ERC721 and ERC875 support. JAX Wallet supports networks: Ethereum, BSC, Avalanche, Polygon.

- Beginner Friendly
- Secure Enclave Security
- Web3 dApp Browser
- No hidden fees or tech background needed

### JAX Wallet Is A Token Wallet

JAX Wallet's focus is to provide an interface to interact with Ethereum Tokens in an intuitive, simple and full featured manner. This is what sets us aside from other open source ethereum wallets.

### Philosophy

JAX Wallet is founded by blockchain geeks, business professionals who believe blockchain technology will have a massive impact on the future and change the landscape of technology in general.

We are committed to connecting businesses and consumers with the new digital economic infrastructure through tokenisation. Tokenised rights can be traded on the market and integrated across systems, forming a Frictionless Market and allowing limitless integration with the web.

We want to give businesses the whitelabel tools they need to develop their ethereum wallets, and join the tokenised economy.

# Getting Started

1. [Download](https://developer.android.com/studio/) Android Studio.
2. Clone this repository
3. Obtain a free Infura API key and replace the one in build.gradle
4. Build the project in AndroidStudio or Run `./gradlew build` to install tools and dependencies.

You can also build it from the commandline just like other Android apps. Note that JDK 8 and 11 are the versions supported by Android.

Find more information in our available [documentation](https://github.com/AlphaWallet/alpha-wallet-android/blob/master/docs/overview.md).

## How to Contribute

You can submit feedback and report bugs as Github issues. Please be sure to include your operating system, device, version number, and steps to reproduce reported bugs.

## How to customise the appearance of your wallet fork

If you are forking JAX Wallet, and have a token that you want to be locked visible this can now be done easily. Let's say we want to only show Ethereum Mainnet, and always show the USDC stablecoin.

```
class CustomViewSettings
{
```
...
```
    private static final List<TokenInfo> lockedTokens = Arrays.asList(
            // new TokenInfo(String TokenAddress, String TokenName, String TokenSymbol, int TokenDecimals, boolean isEnabled, long ChainId)
            new TokenInfo("0xa0b86991c6218b36c1d19d4a2e9eb0ce3606eb48", "USD Coin", "USDC", 6, true, EthereumNetworkBase.MAINNET_ID)
    );
    
    private static final List<Integer> lockedChains = Arrays.asList(
            EthereumNetworkBase.MAINNET_ID
    );
```
Further, you may have your own Dapp that sells or uses the USDC that you want your users to use.
```
public static boolean minimiseBrowserURLBar() { return true; } //this removes the ability to enter URL's directly (they can be clicked on within your dapp)
```
```
public abstract class EthereumNetworkBase ...
{
    private static final String DEFAULT_HOMEPAGE = "https://my-awesome-nfts.com/usdc/";
```
If you are forking JAX Wallet and you have a cool Token, please consider donating a small amount of said Token to `JAX Wallet.eth` to help fund continuing development of the main repo.

### Request or submit a feature :postbox:

Would you like to request a feature? Please get in touch with us [Telegram](https://t.me/jax_chat).

If you’d like to contribute code with a Pull Request, please make sure to follow code submission guidelines.

### Spread the word :hatched_chick:

We want to connect businesses and consumers with the new digital economic infrastructure, where everyone can benefit from technology-enabled free markets. Help us spread the word:

To learn more about us, please check our Blog or join the conversation:

- [Telegram](https://t.me/jax_chat)

JAX Wallet is a decentralized wallet for the Jax.Money platform. It provides a way to manage WJAX, WJXN, JAXRE, JAXUD, and other digital assets conveniently and securely.

Features:
Secure
Decentralized
Convenient

JAX Wallet allows you to store, send, and receive digital coins in complete safety and privacy. It’s a non-custodial wallet that ensures only the owner has full control over the wallet account.

The wallet lets users enjoy full decentralization of carrying out transactions with the leading cryptocurrencies. The app doesn't store any information about users’ accounts and doesn't require KYC for using basic features in the wallet.

Compatible with Ethereum, BSC, Polygon, and Avalanche, it provides a convenient way of accessing a wide range of decentralized applications, including Jax.Money, and transferring funds at the lowest fees across the supported networks.

<!-- markdownlint-enable -->
<!-- prettier-ignore-end -->
<!-- ALL-CONTRIBUTORS-LIST:END -->

