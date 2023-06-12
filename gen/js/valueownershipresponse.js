// source: provenance/metadata/v1/query.proto
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

goog.provide('proto.provenance.metadata.v1.ValueOwnershipResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.provenance.metadata.v1.ValueOwnershipRequest');

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
proto.provenance.metadata.v1.ValueOwnershipResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.ValueOwnershipResponse.repeatedFields_, null);
};
goog.inherits(proto.provenance.metadata.v1.ValueOwnershipResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.ValueOwnershipResponse.displayName = 'proto.provenance.metadata.v1.ValueOwnershipResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.repeatedFields_ = [1];



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
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.ValueOwnershipResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.ValueOwnershipResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    scopeUuidsList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
    request: (f = msg.getRequest()) && proto.provenance.metadata.v1.ValueOwnershipRequest.toObject(includeInstance, f),
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
 * @return {!proto.provenance.metadata.v1.ValueOwnershipResponse}
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.ValueOwnershipResponse;
  return proto.provenance.metadata.v1.ValueOwnershipResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.ValueOwnershipResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.ValueOwnershipResponse}
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addScopeUuids(value);
      break;
    case 98:
      var value = new proto.provenance.metadata.v1.ValueOwnershipRequest;
      reader.readMessage(value,proto.provenance.metadata.v1.ValueOwnershipRequest.deserializeBinaryFromReader);
      msg.setRequest(value);
      break;
    case 99:
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
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.ValueOwnershipResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.ValueOwnershipResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getScopeUuidsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
  f = message.getRequest();
  if (f != null) {
    writer.writeMessage(
      98,
      f,
      proto.provenance.metadata.v1.ValueOwnershipRequest.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      99,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated string scope_uuids = 1;
 * @return {!Array<string>}
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.getScopeUuidsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.provenance.metadata.v1.ValueOwnershipResponse} returns this
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.setScopeUuidsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.ValueOwnershipResponse} returns this
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.addScopeUuids = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.ValueOwnershipResponse} returns this
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.clearScopeUuidsList = function() {
  return this.setScopeUuidsList([]);
};


/**
 * optional ValueOwnershipRequest request = 98;
 * @return {?proto.provenance.metadata.v1.ValueOwnershipRequest}
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.getRequest = function() {
  return /** @type{?proto.provenance.metadata.v1.ValueOwnershipRequest} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.ValueOwnershipRequest, 98));
};


/**
 * @param {?proto.provenance.metadata.v1.ValueOwnershipRequest|undefined} value
 * @return {!proto.provenance.metadata.v1.ValueOwnershipResponse} returns this
*/
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.setRequest = function(value) {
  return jspb.Message.setWrapperField(this, 98, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.ValueOwnershipResponse} returns this
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.clearRequest = function() {
  return this.setRequest(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.hasRequest = function() {
  return jspb.Message.getField(this, 98) != null;
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 99;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 99));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.provenance.metadata.v1.ValueOwnershipResponse} returns this
*/
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 99, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.ValueOwnershipResponse} returns this
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.ValueOwnershipResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 99) != null;
};


