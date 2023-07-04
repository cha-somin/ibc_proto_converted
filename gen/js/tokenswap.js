// source: rizon/tokenswap/tokenswap.proto
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

goog.provide('proto.rizonworld.rizon.tokenswap.Tokenswap');

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
proto.rizonworld.rizon.tokenswap.Tokenswap = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.rizonworld.rizon.tokenswap.Tokenswap.repeatedFields_, null);
};
goog.inherits(proto.rizonworld.rizon.tokenswap.Tokenswap, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.rizonworld.rizon.tokenswap.Tokenswap.displayName = 'proto.rizonworld.rizon.tokenswap.Tokenswap';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.repeatedFields_ = [4];



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
proto.rizonworld.rizon.tokenswap.Tokenswap.prototype.toObject = function(opt_includeInstance) {
  return proto.rizonworld.rizon.tokenswap.Tokenswap.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.rizonworld.rizon.tokenswap.Tokenswap} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.toObject = function(includeInstance, msg) {
  var f, obj = {
    txHash: jspb.Message.getFieldWithDefault(msg, 1, ""),
    receiver: jspb.Message.getFieldWithDefault(msg, 2, ""),
    signer: jspb.Message.getFieldWithDefault(msg, 3, ""),
    amountList: jspb.Message.toObjectList(msg.getAmountList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance)
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
 * @return {!proto.rizonworld.rizon.tokenswap.Tokenswap}
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.rizonworld.rizon.tokenswap.Tokenswap;
  return proto.rizonworld.rizon.tokenswap.Tokenswap.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.rizonworld.rizon.tokenswap.Tokenswap} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.rizonworld.rizon.tokenswap.Tokenswap}
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTxHash(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setReceiver(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSigner(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addAmount(value);
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
proto.rizonworld.rizon.tokenswap.Tokenswap.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.rizonworld.rizon.tokenswap.Tokenswap.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.rizonworld.rizon.tokenswap.Tokenswap} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTxHash();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getReceiver();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSigner();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAmountList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string tx_hash = 1;
 * @return {string}
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.prototype.getTxHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.rizonworld.rizon.tokenswap.Tokenswap} returns this
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.prototype.setTxHash = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string receiver = 2;
 * @return {string}
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.prototype.getReceiver = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.rizonworld.rizon.tokenswap.Tokenswap} returns this
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.prototype.setReceiver = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string signer = 3;
 * @return {string}
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.prototype.getSigner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.rizonworld.rizon.tokenswap.Tokenswap} returns this
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.prototype.setSigner = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin amount = 4;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.prototype.getAmountList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.rizonworld.rizon.tokenswap.Tokenswap} returns this
*/
proto.rizonworld.rizon.tokenswap.Tokenswap.prototype.setAmountList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.prototype.addAmount = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.rizonworld.rizon.tokenswap.Tokenswap} returns this
 */
proto.rizonworld.rizon.tokenswap.Tokenswap.prototype.clearAmountList = function() {
  return this.setAmountList([]);
};

