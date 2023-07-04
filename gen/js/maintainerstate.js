// source: axelar/nexus/v1beta1/types.proto
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

goog.provide('proto.axelar.nexus.v1beta1.MaintainerState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.utils.v1beta1.Bitmap');

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
proto.axelar.nexus.v1beta1.MaintainerState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.nexus.v1beta1.MaintainerState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.nexus.v1beta1.MaintainerState.displayName = 'proto.axelar.nexus.v1beta1.MaintainerState';
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
proto.axelar.nexus.v1beta1.MaintainerState.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.nexus.v1beta1.MaintainerState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.nexus.v1beta1.MaintainerState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.v1beta1.MaintainerState.toObject = function(includeInstance, msg) {
  var f, obj = {
    address: msg.getAddress_asB64(),
    missingVotes: (f = msg.getMissingVotes()) && proto.axelar.utils.v1beta1.Bitmap.toObject(includeInstance, f),
    incorrectVotes: (f = msg.getIncorrectVotes()) && proto.axelar.utils.v1beta1.Bitmap.toObject(includeInstance, f),
    chain: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.axelar.nexus.v1beta1.MaintainerState}
 */
proto.axelar.nexus.v1beta1.MaintainerState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.nexus.v1beta1.MaintainerState;
  return proto.axelar.nexus.v1beta1.MaintainerState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.nexus.v1beta1.MaintainerState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.nexus.v1beta1.MaintainerState}
 */
proto.axelar.nexus.v1beta1.MaintainerState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAddress(value);
      break;
    case 2:
      var value = new proto.axelar.utils.v1beta1.Bitmap;
      reader.readMessage(value,proto.axelar.utils.v1beta1.Bitmap.deserializeBinaryFromReader);
      msg.setMissingVotes(value);
      break;
    case 3:
      var value = new proto.axelar.utils.v1beta1.Bitmap;
      reader.readMessage(value,proto.axelar.utils.v1beta1.Bitmap.deserializeBinaryFromReader);
      msg.setIncorrectVotes(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setChain(value);
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
proto.axelar.nexus.v1beta1.MaintainerState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.nexus.v1beta1.MaintainerState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.nexus.v1beta1.MaintainerState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.v1beta1.MaintainerState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAddress_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getMissingVotes();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.axelar.utils.v1beta1.Bitmap.serializeBinaryToWriter
    );
  }
  f = message.getIncorrectVotes();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.axelar.utils.v1beta1.Bitmap.serializeBinaryToWriter
    );
  }
  f = message.getChain();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional bytes address = 1;
 * @return {string}
 */
proto.axelar.nexus.v1beta1.MaintainerState.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes address = 1;
 * This is a type-conversion wrapper around `getAddress()`
 * @return {string}
 */
proto.axelar.nexus.v1beta1.MaintainerState.prototype.getAddress_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAddress()));
};


/**
 * optional bytes address = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAddress()`
 * @return {!Uint8Array}
 */
proto.axelar.nexus.v1beta1.MaintainerState.prototype.getAddress_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAddress()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.nexus.v1beta1.MaintainerState} returns this
 */
proto.axelar.nexus.v1beta1.MaintainerState.prototype.setAddress = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional axelar.utils.v1beta1.Bitmap missing_votes = 2;
 * @return {?proto.axelar.utils.v1beta1.Bitmap}
 */
proto.axelar.nexus.v1beta1.MaintainerState.prototype.getMissingVotes = function() {
  return /** @type{?proto.axelar.utils.v1beta1.Bitmap} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.Bitmap, 2));
};


/**
 * @param {?proto.axelar.utils.v1beta1.Bitmap|undefined} value
 * @return {!proto.axelar.nexus.v1beta1.MaintainerState} returns this
*/
proto.axelar.nexus.v1beta1.MaintainerState.prototype.setMissingVotes = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.nexus.v1beta1.MaintainerState} returns this
 */
proto.axelar.nexus.v1beta1.MaintainerState.prototype.clearMissingVotes = function() {
  return this.setMissingVotes(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.nexus.v1beta1.MaintainerState.prototype.hasMissingVotes = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional axelar.utils.v1beta1.Bitmap incorrect_votes = 3;
 * @return {?proto.axelar.utils.v1beta1.Bitmap}
 */
proto.axelar.nexus.v1beta1.MaintainerState.prototype.getIncorrectVotes = function() {
  return /** @type{?proto.axelar.utils.v1beta1.Bitmap} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.Bitmap, 3));
};


/**
 * @param {?proto.axelar.utils.v1beta1.Bitmap|undefined} value
 * @return {!proto.axelar.nexus.v1beta1.MaintainerState} returns this
*/
proto.axelar.nexus.v1beta1.MaintainerState.prototype.setIncorrectVotes = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.nexus.v1beta1.MaintainerState} returns this
 */
proto.axelar.nexus.v1beta1.MaintainerState.prototype.clearIncorrectVotes = function() {
  return this.setIncorrectVotes(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.nexus.v1beta1.MaintainerState.prototype.hasIncorrectVotes = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string chain = 4;
 * @return {string}
 */
proto.axelar.nexus.v1beta1.MaintainerState.prototype.getChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.nexus.v1beta1.MaintainerState} returns this
 */
proto.axelar.nexus.v1beta1.MaintainerState.prototype.setChain = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};

