// source: ixo/claims/v1beta1/tx.proto
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

goog.provide('proto.ixo.claims.v1beta1.MsgSubmitClaim');

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
proto.ixo.claims.v1beta1.MsgSubmitClaim = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ixo.claims.v1beta1.MsgSubmitClaim, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.claims.v1beta1.MsgSubmitClaim.displayName = 'proto.ixo.claims.v1beta1.MsgSubmitClaim';
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
proto.ixo.claims.v1beta1.MsgSubmitClaim.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.claims.v1beta1.MsgSubmitClaim.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.claims.v1beta1.MsgSubmitClaim} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.toObject = function(includeInstance, msg) {
  var f, obj = {
    collectionId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    claimId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    agentDid: jspb.Message.getFieldWithDefault(msg, 3, ""),
    agentAddress: jspb.Message.getFieldWithDefault(msg, 4, ""),
    adminAddress: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.ixo.claims.v1beta1.MsgSubmitClaim}
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.claims.v1beta1.MsgSubmitClaim;
  return proto.ixo.claims.v1beta1.MsgSubmitClaim.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.claims.v1beta1.MsgSubmitClaim} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.claims.v1beta1.MsgSubmitClaim}
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setCollectionId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setClaimId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAgentDid(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setAgentAddress(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setAdminAddress(value);
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
proto.ixo.claims.v1beta1.MsgSubmitClaim.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.claims.v1beta1.MsgSubmitClaim.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.claims.v1beta1.MsgSubmitClaim} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCollectionId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getClaimId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAgentDid();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAgentAddress();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getAdminAddress();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional string collection_id = 1;
 * @return {string}
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.prototype.getCollectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.claims.v1beta1.MsgSubmitClaim} returns this
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.prototype.setCollectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string claim_id = 2;
 * @return {string}
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.prototype.getClaimId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.claims.v1beta1.MsgSubmitClaim} returns this
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.prototype.setClaimId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string agent_did = 3;
 * @return {string}
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.prototype.getAgentDid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.claims.v1beta1.MsgSubmitClaim} returns this
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.prototype.setAgentDid = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string agent_address = 4;
 * @return {string}
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.prototype.getAgentAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.claims.v1beta1.MsgSubmitClaim} returns this
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.prototype.setAgentAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string admin_address = 5;
 * @return {string}
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.prototype.getAdminAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.claims.v1beta1.MsgSubmitClaim} returns this
 */
proto.ixo.claims.v1beta1.MsgSubmitClaim.prototype.setAdminAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


