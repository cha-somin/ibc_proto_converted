// source: comdex/rewards/v1beta1/gauge.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.comdex.rewards.v1beta1.Gauge');
goog.provide('proto.comdex.rewards.v1beta1.Gauge.KindCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.google.protobuf.Duration');
goog.require('proto.google.protobuf.Timestamp');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.comdex.rewards.v1beta1.Gauge = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.comdex.rewards.v1beta1.Gauge.oneofGroups_);
};
goog.inherits(proto.comdex.rewards.v1beta1.Gauge, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.rewards.v1beta1.Gauge.displayName = 'proto.comdex.rewards.v1beta1.Gauge';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.comdex.rewards.v1beta1.Gauge.oneofGroups_ = [[13]];

/**
 * @enum {number}
 */
proto.comdex.rewards.v1beta1.Gauge.KindCase = {
  KIND_NOT_SET: 0,
  LIQUIDITY_META_DATA: 13
};

/**
 * @return {proto.comdex.rewards.v1beta1.Gauge.KindCase}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getKindCase = function() {
  return /** @type {proto.comdex.rewards.v1beta1.Gauge.KindCase} */(jspb.Message.computeOneofCase(this, proto.comdex.rewards.v1beta1.Gauge.oneofGroups_[0]));
};



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.rewards.v1beta1.Gauge.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.rewards.v1beta1.Gauge} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.Gauge.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    from: jspb.Message.getFieldWithDefault(msg, 2, ""),
    createdAt: (f = msg.getCreatedAt()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    startTime: (f = msg.getStartTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    gaugeTypeId: jspb.Message.getFieldWithDefault(msg, 5, 0),
    triggerDuration: (f = msg.getTriggerDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    depositAmount: (f = msg.getDepositAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    totalTriggers: jspb.Message.getFieldWithDefault(msg, 8, 0),
    triggeredCount: jspb.Message.getFieldWithDefault(msg, 9, 0),
    distributedAmount: (f = msg.getDistributedAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    isActive: jspb.Message.getBooleanFieldWithDefault(msg, 11, false),
    forSwapFee: jspb.Message.getBooleanFieldWithDefault(msg, 12, false),
    liquidityMetaData: (f = msg.getLiquidityMetaData()) && proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.toObject(includeInstance, f),
    appId: jspb.Message.getFieldWithDefault(msg, 14, 0)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.comdex.rewards.v1beta1.Gauge}
 */
proto.comdex.rewards.v1beta1.Gauge.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.rewards.v1beta1.Gauge;
  return proto.comdex.rewards.v1beta1.Gauge.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.rewards.v1beta1.Gauge} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.rewards.v1beta1.Gauge}
 */
proto.comdex.rewards.v1beta1.Gauge.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setFrom(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setCreatedAt(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartTime(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGaugeTypeId(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setTriggerDuration(value);
      break;
    case 7:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setDepositAmount(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTotalTriggers(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTriggeredCount(value);
      break;
    case 10:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setDistributedAmount(value);
      break;
    case 11:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsActive(value);
      break;
    case 12:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setForSwapFee(value);
      break;
    case 13:
      var value = new proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData;
      reader.readMessage(value,proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.deserializeBinaryFromReader);
      msg.setLiquidityMetaData(value);
      break;
    case 14:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.rewards.v1beta1.Gauge.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.rewards.v1beta1.Gauge} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.Gauge.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getFrom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getCreatedAt();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getStartTime();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getGaugeTypeId();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getTriggerDuration();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getDepositAmount();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTotalTriggers();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
  f = message.getTriggeredCount();
  if (f !== 0) {
    writer.writeUint64(
      9,
      f
    );
  }
  f = message.getDistributedAmount();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getIsActive();
  if (f) {
    writer.writeBool(
      11,
      f
    );
  }
  f = message.getForSwapFee();
  if (f) {
    writer.writeBool(
      12,
      f
    );
  }
  f = message.getLiquidityMetaData();
  if (f != null) {
    writer.writeMessage(
      13,
      f,
      proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.serializeBinaryToWriter
    );
  }
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      14,
      f
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string from = 2;
 * @return {string}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getFrom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.setFrom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional google.protobuf.Timestamp created_at = 3;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getCreatedAt = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 3));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
*/
proto.comdex.rewards.v1beta1.Gauge.prototype.setCreatedAt = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.clearCreatedAt = function() {
  return this.setCreatedAt(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.hasCreatedAt = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional google.protobuf.Timestamp start_time = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getStartTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
*/
proto.comdex.rewards.v1beta1.Gauge.prototype.setStartTime = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.clearStartTime = function() {
  return this.setStartTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.hasStartTime = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional uint64 gauge_type_id = 5;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getGaugeTypeId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.setGaugeTypeId = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional google.protobuf.Duration trigger_duration = 6;
 * @return {?proto.google.protobuf.Duration}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getTriggerDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 6));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
*/
proto.comdex.rewards.v1beta1.Gauge.prototype.setTriggerDuration = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.clearTriggerDuration = function() {
  return this.setTriggerDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.hasTriggerDuration = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin deposit_amount = 7;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getDepositAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 7));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
*/
proto.comdex.rewards.v1beta1.Gauge.prototype.setDepositAmount = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.clearDepositAmount = function() {
  return this.setDepositAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.hasDepositAmount = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional uint64 total_triggers = 8;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getTotalTriggers = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.setTotalTriggers = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional uint64 triggered_count = 9;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getTriggeredCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.setTriggeredCount = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * optional cosmos.base.v1beta1.Coin distributed_amount = 10;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getDistributedAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 10));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
*/
proto.comdex.rewards.v1beta1.Gauge.prototype.setDistributedAmount = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.clearDistributedAmount = function() {
  return this.setDistributedAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.hasDistributedAmount = function() {
  return jspb.Message.getField(this, 10) != null;
};


/**
 * optional bool is_active = 11;
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getIsActive = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 11, false));
};


/**
 * @param {boolean} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.setIsActive = function(value) {
  return jspb.Message.setProto3BooleanField(this, 11, value);
};


/**
 * optional bool for_swap_fee = 12;
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getForSwapFee = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 12, false));
};


/**
 * @param {boolean} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.setForSwapFee = function(value) {
  return jspb.Message.setProto3BooleanField(this, 12, value);
};


/**
 * optional LiquidtyGaugeMetaData liquidity_meta_data = 13;
 * @return {?proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getLiquidityMetaData = function() {
  return /** @type{?proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData} */ (
    jspb.Message.getWrapperField(this, proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData, 13));
};


/**
 * @param {?proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
*/
proto.comdex.rewards.v1beta1.Gauge.prototype.setLiquidityMetaData = function(value) {
  return jspb.Message.setOneofWrapperField(this, 13, proto.comdex.rewards.v1beta1.Gauge.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.clearLiquidityMetaData = function() {
  return this.setLiquidityMetaData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.hasLiquidityMetaData = function() {
  return jspb.Message.getField(this, 13) != null;
};


/**
 * optional uint64 app_id = 14;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 14, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.Gauge} returns this
 */
proto.comdex.rewards.v1beta1.Gauge.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 14, value);
};


