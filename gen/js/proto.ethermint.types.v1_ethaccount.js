// source: ethermint/types/v1/account.proto
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

goog.provide('proto.ethermint.types.v1.EthAccount');

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
proto.ethermint.types.v1.EthAccount = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ethermint.types.v1.EthAccount, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ethermint.types.v1.EthAccount.displayName = 'proto.ethermint.types.v1.EthAccount';
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
proto.ethermint.types.v1.EthAccount.prototype.toObject = function(opt_includeInstance) {
  return proto.ethermint.types.v1.EthAccount.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ethermint.types.v1.EthAccount} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.types.v1.EthAccount.toObject = function(includeInstance, msg) {
  var f, obj = {
    baseAccount: (f = msg.getBaseAccount()) && proto.cosmos.auth.v1beta1.BaseAccount.toObject(includeInstance, f),
    codeHash: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.ethermint.types.v1.EthAccount}
 */
proto.ethermint.types.v1.EthAccount.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ethermint.types.v1.EthAccount;
  return proto.ethermint.types.v1.EthAccount.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ethermint.types.v1.EthAccount} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ethermint.types.v1.EthAccount}
 */
proto.ethermint.types.v1.EthAccount.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {string} */ (reader.readString());
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
proto.ethermint.types.v1.EthAccount.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ethermint.types.v1.EthAccount.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ethermint.types.v1.EthAccount} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.types.v1.EthAccount.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBaseAccount();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.auth.v1beta1.BaseAccount.serializeBinaryToWriter
    );
  }
  f = message.getCodeHash();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional cosmos.auth.v1beta1.BaseAccount base_account = 1;
 * @return {?proto.cosmos.auth.v1beta1.BaseAccount}
 */
proto.ethermint.types.v1.EthAccount.prototype.getBaseAccount = function() {
  return /** @type{?proto.cosmos.auth.v1beta1.BaseAccount} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.auth.v1beta1.BaseAccount, 1));
};


/**
 * @param {?proto.cosmos.auth.v1beta1.BaseAccount|undefined} value
 * @return {!proto.ethermint.types.v1.EthAccount} returns this
*/
proto.ethermint.types.v1.EthAccount.prototype.setBaseAccount = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ethermint.types.v1.EthAccount} returns this
 */
proto.ethermint.types.v1.EthAccount.prototype.clearBaseAccount = function() {
  return this.setBaseAccount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ethermint.types.v1.EthAccount.prototype.hasBaseAccount = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string code_hash = 2;
 * @return {string}
 */
proto.ethermint.types.v1.EthAccount.prototype.getCodeHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.types.v1.EthAccount} returns this
 */
proto.ethermint.types.v1.EthAccount.prototype.setCodeHash = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


