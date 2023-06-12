// source: panacea/datapool/v2alpha1/pool.proto
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

goog.provide('proto.panacea.datapool.v2alpha1.DataCert');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.panacea.datapool.v2alpha1.UnsignedDataCert');

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
proto.panacea.datapool.v2alpha1.DataCert = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.panacea.datapool.v2alpha1.DataCert, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.datapool.v2alpha1.DataCert.displayName = 'proto.panacea.datapool.v2alpha1.DataCert';
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
proto.panacea.datapool.v2alpha1.DataCert.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.datapool.v2alpha1.DataCert.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.datapool.v2alpha1.DataCert} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datapool.v2alpha1.DataCert.toObject = function(includeInstance, msg) {
  var f, obj = {
    unsignedCert: (f = msg.getUnsignedCert()) && proto.panacea.datapool.v2alpha1.UnsignedDataCert.toObject(includeInstance, f),
    signature: msg.getSignature_asB64()
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
 * @return {!proto.panacea.datapool.v2alpha1.DataCert}
 */
proto.panacea.datapool.v2alpha1.DataCert.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.datapool.v2alpha1.DataCert;
  return proto.panacea.datapool.v2alpha1.DataCert.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.datapool.v2alpha1.DataCert} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.datapool.v2alpha1.DataCert}
 */
proto.panacea.datapool.v2alpha1.DataCert.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.panacea.datapool.v2alpha1.UnsignedDataCert;
      reader.readMessage(value,proto.panacea.datapool.v2alpha1.UnsignedDataCert.deserializeBinaryFromReader);
      msg.setUnsignedCert(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSignature(value);
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
proto.panacea.datapool.v2alpha1.DataCert.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.datapool.v2alpha1.DataCert.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.datapool.v2alpha1.DataCert} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datapool.v2alpha1.DataCert.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getUnsignedCert();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.panacea.datapool.v2alpha1.UnsignedDataCert.serializeBinaryToWriter
    );
  }
  f = message.getSignature_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
};


/**
 * optional UnsignedDataCert unsigned_cert = 1;
 * @return {?proto.panacea.datapool.v2alpha1.UnsignedDataCert}
 */
proto.panacea.datapool.v2alpha1.DataCert.prototype.getUnsignedCert = function() {
  return /** @type{?proto.panacea.datapool.v2alpha1.UnsignedDataCert} */ (
    jspb.Message.getWrapperField(this, proto.panacea.datapool.v2alpha1.UnsignedDataCert, 1));
};


/**
 * @param {?proto.panacea.datapool.v2alpha1.UnsignedDataCert|undefined} value
 * @return {!proto.panacea.datapool.v2alpha1.DataCert} returns this
*/
proto.panacea.datapool.v2alpha1.DataCert.prototype.setUnsignedCert = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.panacea.datapool.v2alpha1.DataCert} returns this
 */
proto.panacea.datapool.v2alpha1.DataCert.prototype.clearUnsignedCert = function() {
  return this.setUnsignedCert(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.panacea.datapool.v2alpha1.DataCert.prototype.hasUnsignedCert = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional bytes signature = 2;
 * @return {string}
 */
proto.panacea.datapool.v2alpha1.DataCert.prototype.getSignature = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes signature = 2;
 * This is a type-conversion wrapper around `getSignature()`
 * @return {string}
 */
proto.panacea.datapool.v2alpha1.DataCert.prototype.getSignature_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSignature()));
};


/**
 * optional bytes signature = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSignature()`
 * @return {!Uint8Array}
 */
proto.panacea.datapool.v2alpha1.DataCert.prototype.getSignature_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSignature()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.panacea.datapool.v2alpha1.DataCert} returns this
 */
proto.panacea.datapool.v2alpha1.DataCert.prototype.setSignature = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


