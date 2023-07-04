// source: shentu/burrow/acm.proto
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

goog.provide('proto.acm.ContractMeta');

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
proto.acm.ContractMeta = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.acm.ContractMeta, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.acm.ContractMeta.displayName = 'proto.acm.ContractMeta';
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
proto.acm.ContractMeta.prototype.toObject = function(opt_includeInstance) {
  return proto.acm.ContractMeta.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.acm.ContractMeta} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.acm.ContractMeta.toObject = function(includeInstance, msg) {
  var f, obj = {
    codehash: msg.getCodehash_asB64(),
    metadatahash: msg.getMetadatahash_asB64(),
    metadata: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.acm.ContractMeta}
 */
proto.acm.ContractMeta.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.acm.ContractMeta;
  return proto.acm.ContractMeta.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.acm.ContractMeta} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.acm.ContractMeta}
 */
proto.acm.ContractMeta.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setCodehash(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setMetadatahash(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMetadata(value);
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
proto.acm.ContractMeta.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.acm.ContractMeta.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.acm.ContractMeta} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.acm.ContractMeta.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCodehash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getMetadatahash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getMetadata();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional bytes CodeHash = 1;
 * @return {string}
 */
proto.acm.ContractMeta.prototype.getCodehash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes CodeHash = 1;
 * This is a type-conversion wrapper around `getCodehash()`
 * @return {string}
 */
proto.acm.ContractMeta.prototype.getCodehash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getCodehash()));
};


/**
 * optional bytes CodeHash = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getCodehash()`
 * @return {!Uint8Array}
 */
proto.acm.ContractMeta.prototype.getCodehash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getCodehash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.acm.ContractMeta} returns this
 */
proto.acm.ContractMeta.prototype.setCodehash = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes MetadataHash = 2;
 * @return {string}
 */
proto.acm.ContractMeta.prototype.getMetadatahash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes MetadataHash = 2;
 * This is a type-conversion wrapper around `getMetadatahash()`
 * @return {string}
 */
proto.acm.ContractMeta.prototype.getMetadatahash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getMetadatahash()));
};


/**
 * optional bytes MetadataHash = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getMetadatahash()`
 * @return {!Uint8Array}
 */
proto.acm.ContractMeta.prototype.getMetadatahash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getMetadatahash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.acm.ContractMeta} returns this
 */
proto.acm.ContractMeta.prototype.setMetadatahash = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional string Metadata = 3;
 * @return {string}
 */
proto.acm.ContractMeta.prototype.getMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.acm.ContractMeta} returns this
 */
proto.acm.ContractMeta.prototype.setMetadata = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};

