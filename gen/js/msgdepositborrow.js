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

goog.provide('proto.comdex.lend.v1beta1.MsgDepositBorrow');

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
proto.comdex.lend.v1beta1.MsgDepositBorrow = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.lend.v1beta1.MsgDepositBorrow, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.lend.v1beta1.MsgDepositBorrow.displayName = 'proto.comdex.lend.v1beta1.MsgDepositBorrow';
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
proto.comdex.lend.v1beta1.MsgDepositBorrow.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.lend.v1beta1.MsgDepositBorrow.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.lend.v1beta1.MsgDepositBorrow} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.MsgDepositBorrow.toObject = function(includeInstance, msg) {
  var f, obj = {
    borrower: jspb.Message.getFieldWithDefault(msg, 1, ""),
    borrowId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    amount: (f = msg.getAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.comdex.lend.v1beta1.MsgDepositBorrow}
 */
proto.comdex.lend.v1beta1.MsgDepositBorrow.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.lend.v1beta1.MsgDepositBorrow;
  return proto.comdex.lend.v1beta1.MsgDepositBorrow.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.lend.v1beta1.MsgDepositBorrow} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.lend.v1beta1.MsgDepositBorrow}
 */
proto.comdex.lend.v1beta1.MsgDepositBorrow.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setBorrowId(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmount(value);
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
proto.comdex.lend.v1beta1.MsgDepositBorrow.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.lend.v1beta1.MsgDepositBorrow.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.lend.v1beta1.MsgDepositBorrow} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.MsgDepositBorrow.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBorrower();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getBorrowId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getAmount();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string borrower = 1;
 * @return {string}
 */
proto.comdex.lend.v1beta1.MsgDepositBorrow.prototype.getBorrower = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.lend.v1beta1.MsgDepositBorrow} returns this
 */
proto.comdex.lend.v1beta1.MsgDepositBorrow.prototype.setBorrower = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 borrow_id = 2;
 * @return {number}
 */
proto.comdex.lend.v1beta1.MsgDepositBorrow.prototype.getBorrowId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.lend.v1beta1.MsgDepositBorrow} returns this
 */
proto.comdex.lend.v1beta1.MsgDepositBorrow.prototype.setBorrowId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional cosmos.base.v1beta1.Coin amount = 3;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.lend.v1beta1.MsgDepositBorrow.prototype.getAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.lend.v1beta1.MsgDepositBorrow} returns this
*/
proto.comdex.lend.v1beta1.MsgDepositBorrow.prototype.setAmount = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.lend.v1beta1.MsgDepositBorrow} returns this
 */
proto.comdex.lend.v1beta1.MsgDepositBorrow.prototype.clearAmount = function() {
  return this.setAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.lend.v1beta1.MsgDepositBorrow.prototype.hasAmount = function() {
  return jspb.Message.getField(this, 3) != null;
};


