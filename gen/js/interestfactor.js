// source: kava/hard/v1beta1/query.proto
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

goog.provide('proto.kava.hard.v1beta1.InterestFactor');

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
proto.kava.hard.v1beta1.InterestFactor = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.hard.v1beta1.InterestFactor, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.hard.v1beta1.InterestFactor.displayName = 'proto.kava.hard.v1beta1.InterestFactor';
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
proto.kava.hard.v1beta1.InterestFactor.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.hard.v1beta1.InterestFactor.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.hard.v1beta1.InterestFactor} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.hard.v1beta1.InterestFactor.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    borrowInterestFactor: jspb.Message.getFieldWithDefault(msg, 2, ""),
    supplyInterestFactor: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.kava.hard.v1beta1.InterestFactor}
 */
proto.kava.hard.v1beta1.InterestFactor.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.hard.v1beta1.InterestFactor;
  return proto.kava.hard.v1beta1.InterestFactor.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.hard.v1beta1.InterestFactor} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.hard.v1beta1.InterestFactor}
 */
proto.kava.hard.v1beta1.InterestFactor.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setBorrowInterestFactor(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSupplyInterestFactor(value);
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
proto.kava.hard.v1beta1.InterestFactor.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.hard.v1beta1.InterestFactor.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.hard.v1beta1.InterestFactor} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.hard.v1beta1.InterestFactor.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getBorrowInterestFactor();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSupplyInterestFactor();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.kava.hard.v1beta1.InterestFactor.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.hard.v1beta1.InterestFactor} returns this
 */
proto.kava.hard.v1beta1.InterestFactor.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string borrow_interest_factor = 2;
 * @return {string}
 */
proto.kava.hard.v1beta1.InterestFactor.prototype.getBorrowInterestFactor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.hard.v1beta1.InterestFactor} returns this
 */
proto.kava.hard.v1beta1.InterestFactor.prototype.setBorrowInterestFactor = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string supply_interest_factor = 3;
 * @return {string}
 */
proto.kava.hard.v1beta1.InterestFactor.prototype.getSupplyInterestFactor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.hard.v1beta1.InterestFactor} returns this
 */
proto.kava.hard.v1beta1.InterestFactor.prototype.setSupplyInterestFactor = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


