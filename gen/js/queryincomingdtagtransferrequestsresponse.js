// source: desmos/profiles/v3/query_dtag_requests.proto
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

goog.provide('proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.desmos.profiles.v3.DTagTransferRequest');

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
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.repeatedFields_, null);
};
goog.inherits(proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.displayName = 'proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.repeatedFields_ = [1];



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
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    requestsList: jspb.Message.toObjectList(msg.getRequestsList(),
    proto.desmos.profiles.v3.DTagTransferRequest.toObject, includeInstance),
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
 * @return {!proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse}
 */
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse;
  return proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse}
 */
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.desmos.profiles.v3.DTagTransferRequest;
      reader.readMessage(value,proto.desmos.profiles.v3.DTagTransferRequest.deserializeBinaryFromReader);
      msg.addRequests(value);
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
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRequestsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.desmos.profiles.v3.DTagTransferRequest.serializeBinaryToWriter
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
 * repeated DTagTransferRequest requests = 1;
 * @return {!Array<!proto.desmos.profiles.v3.DTagTransferRequest>}
 */
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.prototype.getRequestsList = function() {
  return /** @type{!Array<!proto.desmos.profiles.v3.DTagTransferRequest>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.desmos.profiles.v3.DTagTransferRequest, 1));
};


/**
 * @param {!Array<!proto.desmos.profiles.v3.DTagTransferRequest>} value
 * @return {!proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse} returns this
*/
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.prototype.setRequestsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.desmos.profiles.v3.DTagTransferRequest=} opt_value
 * @param {number=} opt_index
 * @return {!proto.desmos.profiles.v3.DTagTransferRequest}
 */
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.prototype.addRequests = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.desmos.profiles.v3.DTagTransferRequest, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse} returns this
 */
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.prototype.clearRequestsList = function() {
  return this.setRequestsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse} returns this
*/
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse} returns this
 */
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};

