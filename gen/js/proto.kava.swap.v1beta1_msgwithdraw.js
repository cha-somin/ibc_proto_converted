// source: kava/swap/v1beta1/tx.proto
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

goog.provide('proto.kava.swap.v1beta1.MsgWithdraw');

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
proto.kava.swap.v1beta1.MsgWithdraw = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.swap.v1beta1.MsgWithdraw, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.swap.v1beta1.MsgWithdraw.displayName = 'proto.kava.swap.v1beta1.MsgWithdraw';
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
proto.kava.swap.v1beta1.MsgWithdraw.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.swap.v1beta1.MsgWithdraw.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.swap.v1beta1.MsgWithdraw} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.swap.v1beta1.MsgWithdraw.toObject = function(includeInstance, msg) {
  var f, obj = {
    from: jspb.Message.getFieldWithDefault(msg, 1, ""),
    shares: jspb.Message.getFieldWithDefault(msg, 2, ""),
    minTokenA: (f = msg.getMinTokenA()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    minTokenB: (f = msg.getMinTokenB()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    deadline: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.kava.swap.v1beta1.MsgWithdraw}
 */
proto.kava.swap.v1beta1.MsgWithdraw.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.swap.v1beta1.MsgWithdraw;
  return proto.kava.swap.v1beta1.MsgWithdraw.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.swap.v1beta1.MsgWithdraw} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.swap.v1beta1.MsgWithdraw}
 */
proto.kava.swap.v1beta1.MsgWithdraw.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFrom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setShares(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setMinTokenA(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setMinTokenB(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setDeadline(value);
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
proto.kava.swap.v1beta1.MsgWithdraw.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.swap.v1beta1.MsgWithdraw.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.swap.v1beta1.MsgWithdraw} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.swap.v1beta1.MsgWithdraw.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFrom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getShares();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getMinTokenA();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getMinTokenB();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getDeadline();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
};


/**
 * optional string from = 1;
 * @return {string}
 */
proto.kava.swap.v1beta1.MsgWithdraw.prototype.getFrom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.swap.v1beta1.MsgWithdraw} returns this
 */
proto.kava.swap.v1beta1.MsgWithdraw.prototype.setFrom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string shares = 2;
 * @return {string}
 */
proto.kava.swap.v1beta1.MsgWithdraw.prototype.getShares = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.swap.v1beta1.MsgWithdraw} returns this
 */
proto.kava.swap.v1beta1.MsgWithdraw.prototype.setShares = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional cosmos.base.v1beta1.Coin min_token_a = 3;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.kava.swap.v1beta1.MsgWithdraw.prototype.getMinTokenA = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.kava.swap.v1beta1.MsgWithdraw} returns this
*/
proto.kava.swap.v1beta1.MsgWithdraw.prototype.setMinTokenA = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.swap.v1beta1.MsgWithdraw} returns this
 */
proto.kava.swap.v1beta1.MsgWithdraw.prototype.clearMinTokenA = function() {
  return this.setMinTokenA(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.swap.v1beta1.MsgWithdraw.prototype.hasMinTokenA = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin min_token_b = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.kava.swap.v1beta1.MsgWithdraw.prototype.getMinTokenB = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.kava.swap.v1beta1.MsgWithdraw} returns this
*/
proto.kava.swap.v1beta1.MsgWithdraw.prototype.setMinTokenB = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.swap.v1beta1.MsgWithdraw} returns this
 */
proto.kava.swap.v1beta1.MsgWithdraw.prototype.clearMinTokenB = function() {
  return this.setMinTokenB(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.swap.v1beta1.MsgWithdraw.prototype.hasMinTokenB = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional int64 deadline = 5;
 * @return {number}
 */
proto.kava.swap.v1beta1.MsgWithdraw.prototype.getDeadline = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.kava.swap.v1beta1.MsgWithdraw} returns this
 */
proto.kava.swap.v1beta1.MsgWithdraw.prototype.setDeadline = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


