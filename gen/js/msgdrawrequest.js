// source: comdex/vault/v1beta1/tx.proto
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

goog.provide('proto.comdex.vault.v1beta1.MsgDrawRequest');

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
proto.comdex.vault.v1beta1.MsgDrawRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.vault.v1beta1.MsgDrawRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.vault.v1beta1.MsgDrawRequest.displayName = 'proto.comdex.vault.v1beta1.MsgDrawRequest';
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
proto.comdex.vault.v1beta1.MsgDrawRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.vault.v1beta1.MsgDrawRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.vault.v1beta1.MsgDrawRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    from: jspb.Message.getFieldWithDefault(msg, 1, ""),
    appId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    extendedPairVaultId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    userVaultId: jspb.Message.getFieldWithDefault(msg, 4, 0),
    amount: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.comdex.vault.v1beta1.MsgDrawRequest}
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.vault.v1beta1.MsgDrawRequest;
  return proto.comdex.vault.v1beta1.MsgDrawRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.vault.v1beta1.MsgDrawRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.vault.v1beta1.MsgDrawRequest}
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFrom(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setExtendedPairVaultId(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setUserVaultId(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmount(value);
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
proto.comdex.vault.v1beta1.MsgDrawRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.vault.v1beta1.MsgDrawRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.vault.v1beta1.MsgDrawRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFrom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getExtendedPairVaultId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getUserVaultId();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getAmount();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional string from = 1;
 * @return {string}
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.prototype.getFrom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.vault.v1beta1.MsgDrawRequest} returns this
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.prototype.setFrom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 app_id = 2;
 * @return {number}
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.MsgDrawRequest} returns this
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 extended_pair_vault_id = 3;
 * @return {number}
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.prototype.getExtendedPairVaultId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.MsgDrawRequest} returns this
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.prototype.setExtendedPairVaultId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint64 user_vault_id = 4;
 * @return {number}
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.prototype.getUserVaultId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.MsgDrawRequest} returns this
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.prototype.setUserVaultId = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional string amount = 5;
 * @return {string}
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.prototype.getAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.vault.v1beta1.MsgDrawRequest} returns this
 */
proto.comdex.vault.v1beta1.MsgDrawRequest.prototype.setAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


