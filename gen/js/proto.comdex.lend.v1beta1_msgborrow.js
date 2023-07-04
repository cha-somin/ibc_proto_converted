// source: comdex/lend/v1beta1/tx.proto
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

goog.provide('proto.comdex.lend.v1beta1.MsgBorrow');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.comdex.lend.v1beta1.MsgBorrow = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.lend.v1beta1.MsgBorrow, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.lend.v1beta1.MsgBorrow.displayName = 'proto.comdex.lend.v1beta1.MsgBorrow';
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
proto.comdex.lend.v1beta1.MsgBorrow.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.lend.v1beta1.MsgBorrow.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.lend.v1beta1.MsgBorrow} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.MsgBorrow.toObject = function(includeInstance, msg) {
  var f, obj = {
    borrower: jspb.Message.getFieldWithDefault(msg, 1, ""),
    lendId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    pairId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    isStableBorrow: jspb.Message.getBooleanFieldWithDefault(msg, 4, false),
    amountIn: (f = msg.getAmountIn()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    amountOut: (f = msg.getAmountOut()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.comdex.lend.v1beta1.MsgBorrow}
 */
proto.comdex.lend.v1beta1.MsgBorrow.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.lend.v1beta1.MsgBorrow;
  return proto.comdex.lend.v1beta1.MsgBorrow.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.lend.v1beta1.MsgBorrow} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.lend.v1beta1.MsgBorrow}
 */
proto.comdex.lend.v1beta1.MsgBorrow.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setBorrower(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLendId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPairId(value);
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsStableBorrow(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmountIn(value);
      break;
    case 6:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmountOut(value);
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
proto.comdex.lend.v1beta1.MsgBorrow.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.lend.v1beta1.MsgBorrow.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.lend.v1beta1.MsgBorrow} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.MsgBorrow.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBorrower();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getLendId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getPairId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getIsStableBorrow();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
  f = message.getAmountIn();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getAmountOut();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string borrower = 1;
 * @return {string}
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.getBorrower = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.lend.v1beta1.MsgBorrow} returns this
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.setBorrower = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 lend_id = 2;
 * @return {number}
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.getLendId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.lend.v1beta1.MsgBorrow} returns this
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.setLendId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 pair_id = 3;
 * @return {number}
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.getPairId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.lend.v1beta1.MsgBorrow} returns this
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.setPairId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional bool is_stable_borrow = 4;
 * @return {boolean}
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.getIsStableBorrow = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.comdex.lend.v1beta1.MsgBorrow} returns this
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.setIsStableBorrow = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};


/**
 * optional cosmos.base.v1beta1.Coin amount_in = 5;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.getAmountIn = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.lend.v1beta1.MsgBorrow} returns this
*/
proto.comdex.lend.v1beta1.MsgBorrow.prototype.setAmountIn = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.lend.v1beta1.MsgBorrow} returns this
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.clearAmountIn = function() {
  return this.setAmountIn(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.hasAmountIn = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin amount_out = 6;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.getAmountOut = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 6));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.lend.v1beta1.MsgBorrow} returns this
*/
proto.comdex.lend.v1beta1.MsgBorrow.prototype.setAmountOut = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.lend.v1beta1.MsgBorrow} returns this
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.clearAmountOut = function() {
  return this.setAmountOut(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.lend.v1beta1.MsgBorrow.prototype.hasAmountOut = function() {
  return jspb.Message.getField(this, 6) != null;
};

