echo "Running docker File"
docker build -t learn:latest .
docker run -p 8080:8080 learn:latest

