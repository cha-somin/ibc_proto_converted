// source: kava/bep3/v1beta1/tx.proto
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

goog.provide('proto.kava.bep3.v1beta1.MsgCreateAtomicSwap');

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
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.repeatedFields_, null);
};
goog.inherits(proto.kava.bep3.v1beta1.MsgCreateAtomicSwap, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.displayName = 'proto.kava.bep3.v1beta1.MsgCreateAtomicSwap';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.repeatedFields_ = [7];



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
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.toObject = function(includeInstance, msg) {
  var f, obj = {
    from: jspb.Message.getFieldWithDefault(msg, 1, ""),
    to: jspb.Message.getFieldWithDefault(msg, 2, ""),
    recipientOtherChain: jspb.Message.getFieldWithDefault(msg, 3, ""),
    senderOtherChain: jspb.Message.getFieldWithDefault(msg, 4, ""),
    randomNumberHash: jspb.Message.getFieldWithDefault(msg, 5, ""),
    timestamp: jspb.Message.getFieldWithDefault(msg, 6, 0),
    amountList: jspb.Message.toObjectList(msg.getAmountList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    heightSpan: jspb.Message.getFieldWithDefault(msg, 8, 0)
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
 * @return {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap}
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.bep3.v1beta1.MsgCreateAtomicSwap;
  return proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap}
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setTo(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setRecipientOtherChain(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setSenderOtherChain(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setRandomNumberHash(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setTimestamp(value);
      break;
    case 7:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addAmount(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setHeightSpan(value);
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
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFrom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTo();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getRecipientOtherChain();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getSenderOtherChain();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getRandomNumberHash();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getTimestamp();
  if (f !== 0) {
    writer.writeInt64(
      6,
      f
    );
  }
  f = message.getAmountList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getHeightSpan();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
};


/**
 * optional string from = 1;
 * @return {string}
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.getFrom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap} returns this
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.setFrom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string to = 2;
 * @return {string}
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.getTo = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap} returns this
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.setTo = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string recipient_other_chain = 3;
 * @return {string}
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.getRecipientOtherChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap} returns this
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.setRecipientOtherChain = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string sender_other_chain = 4;
 * @return {string}
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.getSenderOtherChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap} returns this
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.setSenderOtherChain = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string random_number_hash = 5;
 * @return {string}
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.getRandomNumberHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap} returns this
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.setRandomNumberHash = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional int64 timestamp = 6;
 * @return {number}
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.getTimestamp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap} returns this
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.setTimestamp = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin amount = 7;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.getAmountList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 7));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap} returns this
*/
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.setAmountList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.addAmount = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap} returns this
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.clearAmountList = function() {
  return this.setAmountList([]);
};


/**
 * optional uint64 height_span = 8;
 * @return {number}
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.getHeightSpan = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.kava.bep3.v1beta1.MsgCreateAtomicSwap} returns this
 */
proto.kava.bep3.v1beta1.MsgCreateAtomicSwap.prototype.setHeightSpan = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


