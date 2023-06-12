// source: cosmos/group/v1/query.proto
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

goog.provide('proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.cosmos.group.v1.Proposal');

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
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.repeatedFields_, null);
};
goog.inherits(proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.displayName = 'proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.repeatedFields_ = [1];



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
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    proposalsList: jspb.Message.toObjectList(msg.getProposalsList(),
    proto.cosmos.group.v1.Proposal.toObject, includeInstance),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse}
 */
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse;
  return proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse}
 */
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.group.v1.Proposal;
      reader.readMessage(value,proto.cosmos.group.v1.Proposal.deserializeBinaryFromReader);
      msg.addProposals(value);
      break;
    case 2:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
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
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getProposalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.group.v1.Proposal.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Proposal proposals = 1;
 * @return {!Array<!proto.cosmos.group.v1.Proposal>}
 */
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.prototype.getProposalsList = function() {
  return /** @type{!Array<!proto.cosmos.group.v1.Proposal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.group.v1.Proposal, 1));
};


/**
 * @param {!Array<!proto.cosmos.group.v1.Proposal>} value
 * @return {!proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse} returns this
*/
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.prototype.setProposalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.group.v1.Proposal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.group.v1.Proposal}
 */
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.prototype.addProposals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.group.v1.Proposal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse} returns this
 */
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.prototype.clearProposalsList = function() {
  return this.setProposalsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse} returns this
*/
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse} returns this
 */
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


