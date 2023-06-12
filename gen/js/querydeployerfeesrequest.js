// source: canto/fees/v1/query.proto
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

goog.provide('proto.canto.fees.v1.QueryDeployerFeesRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageRequest');

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
proto.canto.fees.v1.QueryDeployerFeesRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.canto.fees.v1.QueryDeployerFeesRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.canto.fees.v1.QueryDeployerFeesRequest.displayName = 'proto.canto.fees.v1.QueryDeployerFeesRequest';
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
proto.canto.fees.v1.QueryDeployerFeesRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.canto.fees.v1.QueryDeployerFeesRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.canto.fees.v1.QueryDeployerFeesRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.canto.fees.v1.QueryDeployerFeesRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    deployerAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
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
 * @return {!proto.canto.fees.v1.QueryDeployerFeesRequest}
 */
proto.canto.fees.v1.QueryDeployerFeesRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.canto.fees.v1.QueryDeployerFeesRequest;
  return proto.canto.fees.v1.QueryDeployerFeesRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.canto.fees.v1.QueryDeployerFeesRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.canto.fees.v1.QueryDeployerFeesRequest}
 */
proto.canto.fees.v1.QueryDeployerFeesRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDeployerAddress(value);
      break;
    case 2:
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
proto.canto.fees.v1.QueryDeployerFeesRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.canto.fees.v1.QueryDeployerFeesRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.canto.fees.v1.QueryDeployerFeesRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.canto.fees.v1.QueryDeployerFeesRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDeployerAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageRequest.serializeBinaryToWriter
    );
  }
};


/**
 * optional string deployer_address = 1;
 * @return {string}
 */
proto.canto.fees.v1.QueryDeployerFeesRequest.prototype.getDeployerAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.canto.fees.v1.QueryDeployerFeesRequest} returns this
 */
proto.canto.fees.v1.QueryDeployerFeesRequest.prototype.setDeployerAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional cosmos.base.query.v1beta1.PageRequest pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageRequest}
 */
proto.canto.fees.v1.QueryDeployerFeesRequest.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageRequest} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageRequest, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageRequest|undefined} value
 * @return {!proto.canto.fees.v1.QueryDeployerFeesRequest} returns this
*/
proto.canto.fees.v1.QueryDeployerFeesRequest.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.canto.fees.v1.QueryDeployerFeesRequest} returns this
 */
proto.canto.fees.v1.QueryDeployerFeesRequest.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.canto.fees.v1.QueryDeployerFeesRequest.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


