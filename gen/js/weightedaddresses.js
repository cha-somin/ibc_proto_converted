// source: kava/auction/v1beta1/auction.proto
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

goog.provide('proto.kava.auction.v1beta1.WeightedAddresses');

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
proto.kava.auction.v1beta1.WeightedAddresses = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kava.auction.v1beta1.WeightedAddresses.repeatedFields_, null);
};
goog.inherits(proto.kava.auction.v1beta1.WeightedAddresses, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.auction.v1beta1.WeightedAddresses.displayName = 'proto.kava.auction.v1beta1.WeightedAddresses';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kava.auction.v1beta1.WeightedAddresses.repeatedFields_ = [1,2];



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
proto.kava.auction.v1beta1.WeightedAddresses.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.auction.v1beta1.WeightedAddresses.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.auction.v1beta1.WeightedAddresses} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.auction.v1beta1.WeightedAddresses.toObject = function(includeInstance, msg) {
  var f, obj = {
    addressesList: msg.getAddressesList_asB64(),
    weightsList: msg.getWeightsList_asB64()
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
 * @return {!proto.kava.auction.v1beta1.WeightedAddresses}
 */
proto.kava.auction.v1beta1.WeightedAddresses.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.auction.v1beta1.WeightedAddresses;
  return proto.kava.auction.v1beta1.WeightedAddresses.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.auction.v1beta1.WeightedAddresses} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.auction.v1beta1.WeightedAddresses}
 */
proto.kava.auction.v1beta1.WeightedAddresses.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addAddresses(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addWeights(value);
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
proto.kava.auction.v1beta1.WeightedAddresses.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.auction.v1beta1.WeightedAddresses.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.auction.v1beta1.WeightedAddresses} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.auction.v1beta1.WeightedAddresses.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAddressesList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      1,
      f
    );
  }
  f = message.getWeightsList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      2,
      f
    );
  }
};


/**
 * repeated bytes addresses = 1;
 * @return {!Array<string>}
 */
proto.kava.auction.v1beta1.WeightedAddresses.prototype.getAddressesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * repeated bytes addresses = 1;
 * This is a type-conversion wrapper around `getAddressesList()`
 * @return {!Array<string>}
 */
proto.kava.auction.v1beta1.WeightedAddresses.prototype.getAddressesList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getAddressesList()));
};


/**
 * repeated bytes addresses = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAddressesList()`
 * @return {!Array<!Uint8Array>}
 */
proto.kava.auction.v1beta1.WeightedAddresses.prototype.getAddressesList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getAddressesList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.kava.auction.v1beta1.WeightedAddresses} returns this
 */
proto.kava.auction.v1beta1.WeightedAddresses.prototype.setAddressesList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.kava.auction.v1beta1.WeightedAddresses} returns this
 */
proto.kava.auction.v1beta1.WeightedAddresses.prototype.addAddresses = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.auction.v1beta1.WeightedAddresses} returns this
 */
proto.kava.auction.v1beta1.WeightedAddresses.prototype.clearAddressesList = function() {
  return this.setAddressesList([]);
};


/**
 * repeated bytes weights = 2;
 * @return {!Array<string>}
 */
proto.kava.auction.v1beta1.WeightedAddresses.prototype.getWeightsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * repeated bytes weights = 2;
 * This is a type-conversion wrapper around `getWeightsList()`
 * @return {!Array<string>}
 */
proto.kava.auction.v1beta1.WeightedAddresses.prototype.getWeightsList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getWeightsList()));
};


/**
 * repeated bytes weights = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getWeightsList()`
 * @return {!Array<!Uint8Array>}
 */
proto.kava.auction.v1beta1.WeightedAddresses.prototype.getWeightsList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getWeightsList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.kava.auction.v1beta1.WeightedAddresses} returns this
 */
proto.kava.auction.v1beta1.WeightedAddresses.prototype.setWeightsList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.kava.auction.v1beta1.WeightedAddresses} returns this
 */
proto.kava.auction.v1beta1.WeightedAddresses.prototype.addWeights = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.auction.v1beta1.WeightedAddresses} returns this
 */
proto.kava.auction.v1beta1.WeightedAddresses.prototype.clearWeightsList = function() {
  return this.setWeightsList([]);
};

