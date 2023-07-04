// source: injective/oracle/v1beta1/tx.proto
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

goog.provide('proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice');

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
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.repeatedFields_, null);
};
goog.inherits(proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.displayName = 'proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.repeatedFields_ = [2,3,4];



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
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    baseList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    quoteList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    priceList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f
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
 * @return {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice}
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice;
  return proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice}
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.addBase(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addQuote(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.addPrice(value);
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
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getBaseList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getQuoteList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
  f = message.getPriceList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      4,
      f
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} returns this
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated string base = 2;
 * @return {!Array<string>}
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.getBaseList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} returns this
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.setBaseList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} returns this
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.addBase = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} returns this
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.clearBaseList = function() {
  return this.setBaseList([]);
};


/**
 * repeated string quote = 3;
 * @return {!Array<string>}
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.getQuoteList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} returns this
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.setQuoteList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} returns this
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.addQuote = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} returns this
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.clearQuoteList = function() {
  return this.setQuoteList([]);
};


/**
 * repeated string price = 4;
 * @return {!Array<string>}
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.getPriceList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} returns this
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.setPriceList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} returns this
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.addPrice = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice} returns this
 */
proto.injective.oracle.v1beta1.MsgRelayPriceFeedPrice.prototype.clearPriceList = function() {
  return this.setPriceList([]);
};

