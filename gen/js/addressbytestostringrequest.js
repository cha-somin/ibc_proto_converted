// source: cosmos/auth/v1beta1/query.proto
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

goog.provide('proto.cosmos.auth.v1beta1.AddressBytesToStringRequest');

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
proto.cosmos.auth.v1beta1.AddressBytesToStringRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.auth.v1beta1.AddressBytesToStringRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.displayName = 'proto.cosmos.auth.v1beta1.AddressBytesToStringRequest';
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
proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.auth.v1beta1.AddressBytesToStringRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    addressBytes: msg.getAddressBytes_asB64()
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
 * @return {!proto.cosmos.auth.v1beta1.AddressBytesToStringRequest}
 */
proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.auth.v1beta1.AddressBytesToStringRequest;
  return proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.auth.v1beta1.AddressBytesToStringRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.auth.v1beta1.AddressBytesToStringRequest}
 */
proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAddressBytes(value);
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
proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.auth.v1beta1.AddressBytesToStringRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAddressBytes_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
};


/**
 * optional bytes address_bytes = 1;
 * @return {string}
 */
proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.prototype.getAddressBytes = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes address_bytes = 1;
 * This is a type-conversion wrapper around `getAddressBytes()`
 * @return {string}
 */
proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.prototype.getAddressBytes_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAddressBytes()));
};


/**
 * optional bytes address_bytes = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAddressBytes()`
 * @return {!Uint8Array}
 */
proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.prototype.getAddressBytes_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAddressBytes()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cosmos.auth.v1beta1.AddressBytesToStringRequest} returns this
 */
proto.cosmos.auth.v1beta1.AddressBytesToStringRequest.prototype.setAddressBytes = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


