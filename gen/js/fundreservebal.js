// source: comdex/lend/v1beta1/lend.proto
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

goog.provide('proto.comdex.lend.v1beta1.FundReserveBal');

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
proto.comdex.lend.v1beta1.FundReserveBal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.lend.v1beta1.FundReserveBal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.lend.v1beta1.FundReserveBal.displayName = 'proto.comdex.lend.v1beta1.FundReserveBal';
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
proto.comdex.lend.v1beta1.FundReserveBal.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.lend.v1beta1.FundReserveBal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.lend.v1beta1.FundReserveBal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.FundReserveBal.toObject = function(includeInstance, msg) {
  var f, obj = {
    assetId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    amountIn: (f = msg.getAmountIn()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    depositTime: (f = msg.getDepositTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    funder: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.comdex.lend.v1beta1.FundReserveBal}
 */
proto.comdex.lend.v1beta1.FundReserveBal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.lend.v1beta1.FundReserveBal;
  return proto.comdex.lend.v1beta1.FundReserveBal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.lend.v1beta1.FundReserveBal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.lend.v1beta1.FundReserveBal}
 */
proto.comdex.lend.v1beta1.FundReserveBal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAssetId(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmountIn(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setDepositTime(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setFunder(value);
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
proto.comdex.lend.v1beta1.FundReserveBal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.lend.v1beta1.FundReserveBal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.lend.v1beta1.FundReserveBal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.FundReserveBal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAssetId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAmountIn();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getDepositTime();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getFunder();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional uint64 asset_id = 1;
 * @return {number}
 */
proto.comdex.lend.v1beta1.FundReserveBal.prototype.getAssetId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.lend.v1beta1.FundReserveBal} returns this
 */
proto.comdex.lend.v1beta1.FundReserveBal.prototype.setAssetId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional cosmos.base.v1beta1.Coin amount_in = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.lend.v1beta1.FundReserveBal.prototype.getAmountIn = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.lend.v1beta1.FundReserveBal} returns this
*/
proto.comdex.lend.v1beta1.FundReserveBal.prototype.setAmountIn = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.lend.v1beta1.FundReserveBal} returns this
 */
proto.comdex.lend.v1beta1.FundReserveBal.prototype.clearAmountIn = function() {
  return this.setAmountIn(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.lend.v1beta1.FundReserveBal.prototype.hasAmountIn = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional google.protobuf.Timestamp deposit_time = 3;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.comdex.lend.v1beta1.FundReserveBal.prototype.getDepositTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 3));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.comdex.lend.v1beta1.FundReserveBal} returns this
*/
proto.comdex.lend.v1beta1.FundReserveBal.prototype.setDepositTime = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.lend.v1beta1.FundReserveBal} returns this
 */
proto.comdex.lend.v1beta1.FundReserveBal.prototype.clearDepositTime = function() {
  return this.setDepositTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.lend.v1beta1.FundReserveBal.prototype.hasDepositTime = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string funder = 4;
 * @return {string}
 */
proto.comdex.lend.v1beta1.FundReserveBal.prototype.getFunder = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.lend.v1beta1.FundReserveBal} returns this
 */
proto.comdex.lend.v1beta1.FundReserveBal.prototype.setFunder = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


