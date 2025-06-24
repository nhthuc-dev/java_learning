# 🚀 Hiệu Năng & Tối Ưu Java

Tối ưu hiệu năng là kỹ năng bắt buộc khi xây dựng ứng dụng lớn, tốc độ cao.

## ✅ Mục tiêu
- Hiểu cách hoạt động của Garbage Collector (G1, ZGC…)
- Phát hiện & xử lý memory leak
- Benchmark code với JMH
- Dùng profiler thực tế như JFR, VisualVM

## 📁 Nội dung
- `gc-tuning/` – ví dụ GC logs, GC flags
- `memory-leak/` – demo memory leak & fix
- `jmh-benchmark/` – đo hiệu năng code thật
- `profiling/` – VisualVM, JFR setup & dùng thử

## ▶️ Cách chạy benchmark
```bash
cd jmh-benchmark
mvn clean install
java -jar target/benchmarks.jar
