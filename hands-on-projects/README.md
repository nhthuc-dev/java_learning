
---

### 📁 `hands-on-projects/README.md`

```markdown
# 💻 Dự Án Thực Chiến

Dự án tổng hợp để áp dụng tất cả kiến thức bạn đã học từ các module trước.

## ✅ Mục tiêu
- Viết REST API theo Clean Architecture
- Áp dụng microservices thực tế với Kafka, Redis
- CI/CD + Observability + Tối ưu hiệu năng
- Đóng gói & triển khai hệ thống hoàn chỉnh

## 📁 Nội dung
- `clean-arch-api/` – backend RESTful với Clean Arch
- `microservices-ecom/` – hệ thống nhiều service: order, user, payment
- `kafka-notifications/` – gửi email khi có đơn hàng mới
- `monitoring-setup/` – Prometheus + Zipkin + Grafana

## ▶️ Chạy toàn bộ hệ thống
```bash
docker-compose -f docker-compose.full.yml up --build
