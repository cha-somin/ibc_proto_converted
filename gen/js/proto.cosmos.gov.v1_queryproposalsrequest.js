// source: cosmos/gov/v1/query.proto
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

goog.provide('proto.cosmos.gov.v1.QueryProposalsRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageRequest');

goog.forwardDeclare('proto.cosmos.gov.v1.ProposalStatus');
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
proto.cosmos.gov.v1.QueryProposalsRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.gov.v1.QueryProposalsRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.gov.v1.QueryProposalsRequest.displayName = 'proto.cosmos.gov.v1.QueryProposalsRequest';
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
proto.cosmos.gov.v1.QueryProposalsRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.gov.v1.QueryProposalsRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.gov.v1.QueryProposalsRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.gov.v1.QueryProposalsRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    proposalStatus: jspb.Message.getFieldWithDefault(msg, 1, 0),
    voter: jspb.Message.getFieldWithDefault(msg, 2, ""),
    depositor: jspb.Message.getFieldWithDefault(msg, 3, ""),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageRequest.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.gov.v1.QueryProposalsRequest}
 */
proto.cosmos.gov.v1.QueryProposalsRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.gov.v1.QueryProposalsRequest;
  return proto.cosmos.gov.v1.QueryProposalsRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.gov.v1.QueryProposalsRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.gov.v1.QueryProposalsRequest}
 */
proto.cosmos.gov.v1.QueryProposalsRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.cosmos.gov.v1.ProposalStatus} */ (reader.readEnum());
      msg.setProposalStatus(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setVoter(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDepositor(value);
      break;
    case 4:
      var value = new proto.cosmos.base.query.v1beta1.PageRequest;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageRequest.deserializeBinaryFromReader);
      msg.setPagination(value);
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
proto.cosmos.gov.v1.QueryProposalsRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.gov.v1.QueryProposalsRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.gov.v1.QueryProposalsRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.gov.v1.QueryProposalsRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getProposalStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getVoter();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDepositor();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.query.v1beta1.PageRequest.serializeBinaryToWriter
    );
  }
};


/**
 * optional ProposalStatus proposal_status = 1;
 * @return {!proto.cosmos.gov.v1.ProposalStatus}
 */
proto.cosmos.gov.v1.QueryProposalsRequest.prototype.getProposalStatus = function() {
  return /** @type {!proto.cosmos.gov.v1.ProposalStatus} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.cosmos.gov.v1.ProposalStatus} value
 * @return {!proto.cosmos.gov.v1.QueryProposalsRequest} returns this
 */
proto.cosmos.gov.v1.QueryProposalsRequest.prototype.setProposalStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional string voter = 2;
 * @return {string}
 */
proto.cosmos.gov.v1.QueryProposalsRequest.prototype.getVoter = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.gov.v1.QueryProposalsRequest} returns this
 */
proto.cosmos.gov.v1.QueryProposalsRequest.prototype.setVoter = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string depositor = 3;
 * @return {string}
 */
proto.cosmos.gov.v1.QueryProposalsRequest.prototype.getDepositor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.gov.v1.QueryProposalsRequest} returns this
 */
proto.cosmos.gov.v1.QueryProposalsRequest.prototype.setDepositor = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional cosmos.base.query.v1beta1.PageRequest pagination = 4;
 * @return {?proto.cosmos.base.query.v1beta1.PageRequest}
 */
proto.cosmos.gov.v1.QueryProposalsRequest.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageRequest} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageRequest, 4));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageRequest|undefined} value
 * @return {!proto.cosmos.gov.v1.QueryProposalsRequest} returns this
*/
proto.cosmos.gov.v1.QueryProposalsRequest.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.gov.v1.QueryProposalsRequest} returns this
 */
proto.cosmos.gov.v1.QueryProposalsRequest.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.gov.v1.QueryProposalsRequest.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 4) != null;
};


