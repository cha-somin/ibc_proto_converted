// source: onomyprotocol/dao/v1/dao.proto
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

goog.provide('proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.onomyprotocol.dao.v1.CoinsExchangePair');

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
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.repeatedFields_, null);
};
goog.inherits(proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.displayName = 'proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.repeatedFields_ = [4];



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
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    title: jspb.Message.getFieldWithDefault(msg, 2, ""),
    description: jspb.Message.getFieldWithDefault(msg, 3, ""),
    coinsPairsList: jspb.Message.toObjectList(msg.getCoinsPairsList(),
    proto.onomyprotocol.dao.v1.CoinsExchangePair.toObject, includeInstance)
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
 * @return {!proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal}
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal;
  return proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal}
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 4:
      var value = new proto.onomyprotocol.dao.v1.CoinsExchangePair;
      reader.readMessage(value,proto.onomyprotocol.dao.v1.CoinsExchangePair.deserializeBinaryFromReader);
      msg.addCoinsPairs(value);
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
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getCoinsPairsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.onomyprotocol.dao.v1.CoinsExchangePair.serializeBinaryToWriter
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal} returns this
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string title = 2;
 * @return {string}
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal} returns this
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string description = 3;
 * @return {string}
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal} returns this
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated CoinsExchangePair coins_pairs = 4;
 * @return {!Array<!proto.onomyprotocol.dao.v1.CoinsExchangePair>}
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.prototype.getCoinsPairsList = function() {
  return /** @type{!Array<!proto.onomyprotocol.dao.v1.CoinsExchangePair>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.onomyprotocol.dao.v1.CoinsExchangePair, 4));
};


/**
 * @param {!Array<!proto.onomyprotocol.dao.v1.CoinsExchangePair>} value
 * @return {!proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal} returns this
*/
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.prototype.setCoinsPairsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.onomyprotocol.dao.v1.CoinsExchangePair=} opt_value
 * @param {number=} opt_index
 * @return {!proto.onomyprotocol.dao.v1.CoinsExchangePair}
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.prototype.addCoinsPairs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.onomyprotocol.dao.v1.CoinsExchangePair, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal} returns this
 */
proto.onomyprotocol.dao.v1.ExchangeWithTreasuryProposal.prototype.clearCoinsPairsList = function() {
  return this.setCoinsPairsList([]);
};

