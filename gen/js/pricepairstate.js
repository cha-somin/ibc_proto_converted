// source: injective/oracle/v1beta1/query.proto
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

goog.provide('proto.injective.oracle.v1beta1.PricePairState');

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
proto.injective.oracle.v1beta1.PricePairState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.oracle.v1beta1.PricePairState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.oracle.v1beta1.PricePairState.displayName = 'proto.injective.oracle.v1beta1.PricePairState';
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
proto.injective.oracle.v1beta1.PricePairState.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.oracle.v1beta1.PricePairState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.oracle.v1beta1.PricePairState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.PricePairState.toObject = function(includeInstance, msg) {
  var f, obj = {
    pairPrice: jspb.Message.getFieldWithDefault(msg, 1, ""),
    basePrice: jspb.Message.getFieldWithDefault(msg, 2, ""),
    quotePrice: jspb.Message.getFieldWithDefault(msg, 3, ""),
    baseCumulativePrice: jspb.Message.getFieldWithDefault(msg, 4, ""),
    quoteCumulativePrice: jspb.Message.getFieldWithDefault(msg, 5, ""),
    baseTimestamp: jspb.Message.getFieldWithDefault(msg, 6, 0),
    quoteTimestamp: jspb.Message.getFieldWithDefault(msg, 7, 0)
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
 * @return {!proto.injective.oracle.v1beta1.PricePairState}
 */
proto.injective.oracle.v1beta1.PricePairState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.oracle.v1beta1.PricePairState;
  return proto.injective.oracle.v1beta1.PricePairState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.oracle.v1beta1.PricePairState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.oracle.v1beta1.PricePairState}
 */
proto.injective.oracle.v1beta1.PricePairState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setPairPrice(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setBasePrice(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setQuotePrice(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setBaseCumulativePrice(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setQuoteCumulativePrice(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setBaseTimestamp(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setQuoteTimestamp(value);
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
proto.injective.oracle.v1beta1.PricePairState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.oracle.v1beta1.PricePairState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.oracle.v1beta1.PricePairState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.PricePairState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPairPrice();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getBasePrice();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getQuotePrice();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getBaseCumulativePrice();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getQuoteCumulativePrice();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getBaseTimestamp();
  if (f !== 0) {
    writer.writeInt64(
      6,
      f
    );
  }
  f = message.getQuoteTimestamp();
  if (f !== 0) {
    writer.writeInt64(
      7,
      f
    );
  }
};


/**
 * optional string pair_price = 1;
 * @return {string}
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.getPairPrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.oracle.v1beta1.PricePairState} returns this
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.setPairPrice = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string base_price = 2;
 * @return {string}
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.getBasePrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.oracle.v1beta1.PricePairState} returns this
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.setBasePrice = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string quote_price = 3;
 * @return {string}
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.getQuotePrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.oracle.v1beta1.PricePairState} returns this
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.setQuotePrice = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string base_cumulative_price = 4;
 * @return {string}
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.getBaseCumulativePrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.oracle.v1beta1.PricePairState} returns this
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.setBaseCumulativePrice = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string quote_cumulative_price = 5;
 * @return {string}
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.getQuoteCumulativePrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.oracle.v1beta1.PricePairState} returns this
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.setQuoteCumulativePrice = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional int64 base_timestamp = 6;
 * @return {number}
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.getBaseTimestamp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.PricePairState} returns this
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.setBaseTimestamp = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional int64 quote_timestamp = 7;
 * @return {number}
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.getQuoteTimestamp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.PricePairState} returns this
 */
proto.injective.oracle.v1beta1.PricePairState.prototype.setQuoteTimestamp = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};

