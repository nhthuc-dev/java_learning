
---

### 📁 `devops-ci-cd/README.md`

```markdown
# 🛠 DevOps & CI/CD cho Java

Dành cho Java Dev muốn nâng cấp lên Full-stack triển khai và vận hành hệ thống.

## ✅ Mục tiêu
- Dockerize ứng dụng Java
- Dùng GitHub Actions để build/test/deploy
- Logging & distributed tracing (ELK, Sleuth)

## 📁 Nội dung
- `docker/` – Dockerfile cho Java app
- `ci-pipeline/` – GitHub Actions workflow mẫu
- `logging/` – cấu hình logback, file log
- `tracing/` – Sleuth + Zipkin demo

## ▶️ Chạy Docker local
```bash
docker build -t my-java-app .
docker run -p 8080:8080 my-java-app
