// source: likechain/likenft/v1/event.proto
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

goog.provide('proto.likechain.likenft.v1.EventSellNFT');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.likechain.likenft.v1.EventSellNFT = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.likechain.likenft.v1.EventSellNFT, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.likenft.v1.EventSellNFT.displayName = 'proto.likechain.likenft.v1.EventSellNFT';
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
proto.likechain.likenft.v1.EventSellNFT.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.likenft.v1.EventSellNFT.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.likenft.v1.EventSellNFT} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.EventSellNFT.toObject = function(includeInstance, msg) {
  var f, obj = {
    classId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    nftId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    seller: jspb.Message.getFieldWithDefault(msg, 3, ""),
    buyer: jspb.Message.getFieldWithDefault(msg, 4, ""),
    price: jspb.Message.getFieldWithDefault(msg, 5, 0),
    fullPayToRoyalty: jspb.Message.getBooleanFieldWithDefault(msg, 6, false)
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
 * @return {!proto.likechain.likenft.v1.EventSellNFT}
 */
proto.likechain.likenft.v1.EventSellNFT.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.likenft.v1.EventSellNFT;
  return proto.likechain.likenft.v1.EventSellNFT.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.likenft.v1.EventSellNFT} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.likenft.v1.EventSellNFT}
 */
proto.likechain.likenft.v1.EventSellNFT.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setClassId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setNftId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSeller(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setBuyer(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPrice(value);
      break;
    case 6:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setFullPayToRoyalty(value);
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
proto.likechain.likenft.v1.EventSellNFT.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.likenft.v1.EventSellNFT.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.likenft.v1.EventSellNFT} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.EventSellNFT.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClassId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getNftId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSeller();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getBuyer();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getPrice();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getFullPayToRoyalty();
  if (f) {
    writer.writeBool(
      6,
      f
    );
  }
};


/**
 * optional string class_id = 1;
 * @return {string}
 */
proto.likechain.likenft.v1.EventSellNFT.prototype.getClassId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.EventSellNFT} returns this
 */
proto.likechain.likenft.v1.EventSellNFT.prototype.setClassId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string nft_id = 2;
 * @return {string}
 */
proto.likechain.likenft.v1.EventSellNFT.prototype.getNftId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.EventSellNFT} returns this
 */
proto.likechain.likenft.v1.EventSellNFT.prototype.setNftId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string seller = 3;
 * @return {string}
 */
proto.likechain.likenft.v1.EventSellNFT.prototype.getSeller = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.EventSellNFT} returns this
 */
proto.likechain.likenft.v1.EventSellNFT.prototype.setSeller = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string buyer = 4;
 * @return {string}
 */
proto.likechain.likenft.v1.EventSellNFT.prototype.getBuyer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.EventSellNFT} returns this
 */
proto.likechain.likenft.v1.EventSellNFT.prototype.setBuyer = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional uint64 price = 5;
 * @return {number}
 */
proto.likechain.likenft.v1.EventSellNFT.prototype.getPrice = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.likechain.likenft.v1.EventSellNFT} returns this
 */
proto.likechain.likenft.v1.EventSellNFT.prototype.setPrice = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional bool full_pay_to_royalty = 6;
 * @return {boolean}
 */
proto.likechain.likenft.v1.EventSellNFT.prototype.getFullPayToRoyalty = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 6, false));
};


/**
 * @param {boolean} value
 * @return {!proto.likechain.likenft.v1.EventSellNFT} returns this
 */
proto.likechain.likenft.v1.EventSellNFT.prototype.setFullPayToRoyalty = function(value) {
  return jspb.Message.setProto3BooleanField(this, 6, value);
};


