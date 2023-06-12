// source: kyve/query/v1beta1/delegation.proto
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

goog.provide('proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.kyve.query.v1beta1.StakerDelegatorResponse');

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
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.repeatedFields_, null);
};
goog.inherits(proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.displayName = 'proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.repeatedFields_ = [1];



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
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    delegatorsList: jspb.Message.toObjectList(msg.getDelegatorsList(),
    proto.kyve.query.v1beta1.StakerDelegatorResponse.toObject, includeInstance),
    totalDelegation: jspb.Message.getFieldWithDefault(msg, 2, 0),
    totalDelegatorCount: jspb.Message.getFieldWithDefault(msg, 3, 0),
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
 * @return {!proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse}
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse;
  return proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse}
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.kyve.query.v1beta1.StakerDelegatorResponse;
      reader.readMessage(value,proto.kyve.query.v1beta1.StakerDelegatorResponse.deserializeBinaryFromReader);
      msg.addDelegators(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTotalDelegation(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTotalDelegatorCount(value);
      break;
    case 4:
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
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDelegatorsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.kyve.query.v1beta1.StakerDelegatorResponse.serializeBinaryToWriter
    );
  }
  f = message.getTotalDelegation();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getTotalDelegatorCount();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated StakerDelegatorResponse delegators = 1;
 * @return {!Array<!proto.kyve.query.v1beta1.StakerDelegatorResponse>}
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.getDelegatorsList = function() {
  return /** @type{!Array<!proto.kyve.query.v1beta1.StakerDelegatorResponse>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.query.v1beta1.StakerDelegatorResponse, 1));
};


/**
 * @param {!Array<!proto.kyve.query.v1beta1.StakerDelegatorResponse>} value
 * @return {!proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse} returns this
*/
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.setDelegatorsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.kyve.query.v1beta1.StakerDelegatorResponse=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.query.v1beta1.StakerDelegatorResponse}
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.addDelegators = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.kyve.query.v1beta1.StakerDelegatorResponse, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse} returns this
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.clearDelegatorsList = function() {
  return this.setDelegatorsList([]);
};


/**
 * optional uint64 total_delegation = 2;
 * @return {number}
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.getTotalDelegation = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse} returns this
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.setTotalDelegation = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 total_delegator_count = 3;
 * @return {number}
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.getTotalDelegatorCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse} returns this
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.setTotalDelegatorCount = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 4;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 4));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse} returns this
*/
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse} returns this
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.query.v1beta1.QueryDelegatorsByStakerResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 4) != null;
};


