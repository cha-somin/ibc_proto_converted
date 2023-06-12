// source: comdex/rewards/v1beta1/rewards.proto
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

goog.provide('proto.comdex.rewards.v1beta1.StableVaultExternalRewards');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
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
proto.comdex.rewards.v1beta1.StableVaultExternalRewards = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.rewards.v1beta1.StableVaultExternalRewards, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.rewards.v1beta1.StableVaultExternalRewards.displayName = 'proto.comdex.rewards.v1beta1.StableVaultExternalRewards';
}



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
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.rewards.v1beta1.StableVaultExternalRewards.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    appId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    cswapAppId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    commodoAppId: jspb.Message.getFieldWithDefault(msg, 4, 0),
    totalRewards: (f = msg.getTotalRewards()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    durationDays: jspb.Message.getFieldWithDefault(msg, 6, 0),
    isActive: jspb.Message.getBooleanFieldWithDefault(msg, 7, false),
    availableRewards: (f = msg.getAvailableRewards()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    depositor: jspb.Message.getFieldWithDefault(msg, 9, ""),
    startTimestamp: (f = msg.getStartTimestamp()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    endTimestamp: (f = msg.getEndTimestamp()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    acceptedBlockHeight: jspb.Message.getFieldWithDefault(msg, 12, 0),
    epochId: jspb.Message.getFieldWithDefault(msg, 13, 0)
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
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.rewards.v1beta1.StableVaultExternalRewards;
  return proto.comdex.rewards.v1beta1.StableVaultExternalRewards.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCswapAppId(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCommodoAppId(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTotalRewards(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setDurationDays(value);
      break;
    case 7:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsActive(value);
      break;
    case 8:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAvailableRewards(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setDepositor(value);
      break;
    case 10:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartTimestamp(value);
      break;
    case 11:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setEndTimestamp(value);
      break;
    case 12:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setAcceptedBlockHeight(value);
      break;
    case 13:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setEpochId(value);
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
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.rewards.v1beta1.StableVaultExternalRewards.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getCswapAppId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getCommodoAppId();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getTotalRewards();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getDurationDays();
  if (f !== 0) {
    writer.writeInt64(
      6,
      f
    );
  }
  f = message.getIsActive();
  if (f) {
    writer.writeBool(
      7,
      f
    );
  }
  f = message.getAvailableRewards();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getDepositor();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getStartTimestamp();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getEndTimestamp();
  if (f != null) {
    writer.writeMessage(
      11,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getAcceptedBlockHeight();
  if (f !== 0) {
    writer.writeInt64(
      12,
      f
    );
  }
  f = message.getEpochId();
  if (f !== 0) {
    writer.writeUint64(
      13,
      f
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 app_id = 2;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 cswap_app_id = 3;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getCswapAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setCswapAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint64 commodo_app_id = 4;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getCommodoAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setCommodoAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional cosmos.base.v1beta1.Coin total_rewards = 5;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getTotalRewards = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
*/
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setTotalRewards = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.clearTotalRewards = function() {
  return this.setTotalRewards(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.hasTotalRewards = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional int64 duration_days = 6;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getDurationDays = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setDurationDays = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional bool is_active = 7;
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getIsActive = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 7, false));
};


/**
 * @param {boolean} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setIsActive = function(value) {
  return jspb.Message.setProto3BooleanField(this, 7, value);
};


/**
 * optional cosmos.base.v1beta1.Coin available_rewards = 8;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getAvailableRewards = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 8));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
*/
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setAvailableRewards = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.clearAvailableRewards = function() {
  return this.setAvailableRewards(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.hasAvailableRewards = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional string depositor = 9;
 * @return {string}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getDepositor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setDepositor = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional google.protobuf.Timestamp start_timestamp = 10;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getStartTimestamp = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 10));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
*/
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setStartTimestamp = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.clearStartTimestamp = function() {
  return this.setStartTimestamp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.hasStartTimestamp = function() {
  return jspb.Message.getField(this, 10) != null;
};


/**
 * optional google.protobuf.Timestamp end_timestamp = 11;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getEndTimestamp = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 11));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
*/
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setEndTimestamp = function(value) {
  return jspb.Message.setWrapperField(this, 11, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.clearEndTimestamp = function() {
  return this.setEndTimestamp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.hasEndTimestamp = function() {
  return jspb.Message.getField(this, 11) != null;
};


/**
 * optional int64 accepted_block_height = 12;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getAcceptedBlockHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 12, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setAcceptedBlockHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 12, value);
};


/**
 * optional uint64 epoch_id = 13;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.getEpochId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 13, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.StableVaultExternalRewards} returns this
 */
proto.comdex.rewards.v1beta1.StableVaultExternalRewards.prototype.setEpochId = function(value) {
  return jspb.Message.setProto3IntField(this, 13, value);
};


