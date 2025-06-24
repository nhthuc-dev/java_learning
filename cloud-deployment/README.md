
---

### 📁 `cloud-deployment/README.md`

```markdown
# ☁️ Triển Khai Hệ Thống Java Trên Cloud

Hướng dẫn cách triển khai ứng dụng Java lên môi trường thực tế (Cloud, Kubernetes).

## ✅ Mục tiêu
- Deploy ứng dụng lên AWS (EC2, ECS, RDS)
- Deploy lên Kubernetes với Helm chart
- Áp dụng autoscaling, service mesh

## 📁 Nội dung
- `aws-ec2/` – chạy app trên máy ảo EC2
- `docker-k8s/` – docker + YAML deployment K8s
- `helm-chart/` – helm chart cho microservice
- `monitoring/` – Prometheus + Grafana setup

## ▶️ Triển khai K8s
```bash
kubectl apply -f deployment.yaml
