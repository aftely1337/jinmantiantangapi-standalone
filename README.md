# 禁漫天堂 API 版 - Tachiyomi 扩展

基于移动端 API 实现的 Tachiyomi 扩展，支持完整的登录功能。

## 功能特性

- ✅ 完整登录系统（用户名密码登录）
- ✅ Token 签名 + AES 响应解密
- ✅ Cookie 持久化管理
- ✅ 图片混淆解密
- ✅ 多域名支持
- ✅ 限流控制

## 安装方法

### 方法1: 下载预编译APK（推荐）

1. 进入 [Releases](../../releases) 页面
2. 下载最新的 `jinmantiantangapi-v*.apk`
3. 在 Tachiyomi/Mihon 中安装：设置 → 扩展 → 安装APK

### 方法2: 自己编译

需要：JDK 17+, Android SDK

```bash
git clone https://github.com/你的用户名/jinmantiantangapi-standalone.git
cd jinmantiantangapi-standalone
./gradlew assembleRelease
```

APK位置：`build/outputs/apk/release/`

## 使用说明

1. 安装插件后，打开插件设置
2. 输入禁漫天堂用户名和密码
3. 点击"测试登录"验证
4. 登录成功后即可浏览需要登录的内容

## 技术架构

- **加密**: MD5 Token签名 + AES-ECB响应解密
- **认证**: Cookie持久化 + 自动会话管理
- **图片**: 混淆解密算法（支持多种混淆方式）
- **网络**: OkHttp + 自定义拦截器

## 与原版插件的区别

| 特性 | 原版（网页解析） | API版（本插件） |
|------|-----------------|----------------|
| 登录功能 | ❌ | ✅ |
| 需要登录的内容 | ❌ | ✅ |
| Cloudflare影响 | ⚠️ 可能被拦截 | ✅ 几乎不受影响 |
| 数据来源 | HTML解析 | 移动端API |

## 许可证

Apache License 2.0

## 免责声明

本插件仅供学习交流使用，请遵守当地法律法规。
