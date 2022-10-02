# https://unix.stackexchange.com/questions/25945/how-to-check-if-there-are-no-parameters-provided-to-a-command
if [ $# -eq 0 ]; then
  echo "No arguments provided"
  exit 1
fi

kafka_topic=$1
~/apps/kafka/bin/kafka-console-consumer.sh --topic "${kafka_topic}" --from-beginning --bootstrap-server localhost:9092
