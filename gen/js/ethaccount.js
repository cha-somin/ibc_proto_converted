// source: injective/types/v1beta1/account.proto
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

goog.provide('proto.injective.types.v1beta1.EthAccount');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.auth.v1beta1.BaseAccount');

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
proto.injective.types.v1beta1.EthAccount = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.types.v1beta1.EthAccount, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.types.v1beta1.EthAccount.displayName = 'proto.injective.types.v1beta1.EthAccount';
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
proto.injective.types.v1beta1.EthAccount.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.types.v1beta1.EthAccount.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.types.v1beta1.EthAccount} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.types.v1beta1.EthAccount.toObject = function(includeInstance, msg) {
  var f, obj = {
    baseAccount: (f = msg.getBaseAccount()) && proto.cosmos.auth.v1beta1.BaseAccount.toObject(includeInstance, f),
    codeHash: msg.getCodeHash_asB64()
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
 * @return {!proto.injective.types.v1beta1.EthAccount}
 */
proto.injective.types.v1beta1.EthAccount.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.types.v1beta1.EthAccount;
  return proto.injective.types.v1beta1.EthAccount.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.types.v1beta1.EthAccount} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.types.v1beta1.EthAccount}
 */
proto.injective.types.v1beta1.EthAccount.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.auth.v1beta1.BaseAccount;
      reader.readMessage(value,proto.cosmos.auth.v1beta1.BaseAccount.deserializeBinaryFromReader);
      msg.setBaseAccount(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setCodeHash(value);
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
proto.injective.types.v1beta1.EthAccount.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.types.v1beta1.EthAccount.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.types.v1beta1.EthAccount} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.types.v1beta1.EthAccount.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBaseAccount();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.auth.v1beta1.BaseAccount.serializeBinaryToWriter
    );
  }
  f = message.getCodeHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
};


/**
 * optional cosmos.auth.v1beta1.BaseAccount base_account = 1;
 * @return {?proto.cosmos.auth.v1beta1.BaseAccount}
 */
proto.injective.types.v1beta1.EthAccount.prototype.getBaseAccount = function() {
  return /** @type{?proto.cosmos.auth.v1beta1.BaseAccount} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.auth.v1beta1.BaseAccount, 1));
};


/**
 * @param {?proto.cosmos.auth.v1beta1.BaseAccount|undefined} value
 * @return {!proto.injective.types.v1beta1.EthAccount} returns this
*/
proto.injective.types.v1beta1.EthAccount.prototype.setBaseAccount = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.types.v1beta1.EthAccount} returns this
 */
proto.injective.types.v1beta1.EthAccount.prototype.clearBaseAccount = function() {
  return this.setBaseAccount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.types.v1beta1.EthAccount.prototype.hasBaseAccount = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional bytes code_hash = 2;
 * @return {string}
 */
proto.injective.types.v1beta1.EthAccount.prototype.getCodeHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes code_hash = 2;
 * This is a type-conversion wrapper around `getCodeHash()`
 * @return {string}
 */
proto.injective.types.v1beta1.EthAccount.prototype.getCodeHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getCodeHash()));
};


/**
 * optional bytes code_hash = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getCodeHash()`
 * @return {!Uint8Array}
 */
proto.injective.types.v1beta1.EthAccount.prototype.getCodeHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getCodeHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.types.v1beta1.EthAccount} returns this
 */
proto.injective.types.v1beta1.EthAccount.prototype.setCodeHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


