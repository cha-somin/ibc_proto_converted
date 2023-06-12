// source: osmosis/concentrated-liquidity/tx.proto
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

goog.provide('proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
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
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.displayName = 'proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse';
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
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    positionId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    amount0: jspb.Message.getFieldWithDefault(msg, 2, ""),
    amount1: jspb.Message.getFieldWithDefault(msg, 3, ""),
    joinTime: (f = msg.getJoinTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    liquidityCreated: jspb.Message.getFieldWithDefault(msg, 5, ""),
    lowerTick: jspb.Message.getFieldWithDefault(msg, 6, 0),
    upperTick: jspb.Message.getFieldWithDefault(msg, 7, 0)
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
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse}
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse;
  return proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse}
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPositionId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmount0(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmount1(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setJoinTime(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setLiquidityCreated(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setLowerTick(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setUpperTick(value);
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
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPositionId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAmount0();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAmount1();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getJoinTime();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getLiquidityCreated();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getLowerTick();
  if (f !== 0) {
    writer.writeInt64(
      6,
      f
    );
  }
  f = message.getUpperTick();
  if (f !== 0) {
    writer.writeInt64(
      7,
      f
    );
  }
};


/**
 * optional uint64 position_id = 1;
 * @return {number}
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.getPositionId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.setPositionId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string amount0 = 2;
 * @return {string}
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.getAmount0 = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.setAmount0 = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string amount1 = 3;
 * @return {string}
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.getAmount1 = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.setAmount1 = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional google.protobuf.Timestamp join_time = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.getJoinTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse} returns this
*/
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.setJoinTime = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.clearJoinTime = function() {
  return this.setJoinTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.hasJoinTime = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional string liquidity_created = 5;
 * @return {string}
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.getLiquidityCreated = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.setLiquidityCreated = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional int64 lower_tick = 6;
 * @return {number}
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.getLowerTick = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.setLowerTick = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional int64 upper_tick = 7;
 * @return {number}
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.getUpperTick = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse.prototype.setUpperTick = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


