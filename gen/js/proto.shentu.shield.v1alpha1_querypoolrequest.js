// source: shentu/shield/v1alpha1/query.proto
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

goog.provide('proto.shentu.shield.v1alpha1.QueryPoolRequest');

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
proto.shentu.shield.v1alpha1.QueryPoolRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.shentu.shield.v1alpha1.QueryPoolRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.shentu.shield.v1alpha1.QueryPoolRequest.displayName = 'proto.shentu.shield.v1alpha1.QueryPoolRequest';
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
proto.shentu.shield.v1alpha1.QueryPoolRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.shentu.shield.v1alpha1.QueryPoolRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.shentu.shield.v1alpha1.QueryPoolRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.shield.v1alpha1.QueryPoolRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolId: jspb.Message.getFieldWithDefault(msg, 1, 0)
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
 * @return {!proto.shentu.shield.v1alpha1.QueryPoolRequest}
 */
proto.shentu.shield.v1alpha1.QueryPoolRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.shentu.shield.v1alpha1.QueryPoolRequest;
  return proto.shentu.shield.v1alpha1.QueryPoolRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.shentu.shield.v1alpha1.QueryPoolRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.shentu.shield.v1alpha1.QueryPoolRequest}
 */
proto.shentu.shield.v1alpha1.QueryPoolRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
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
proto.shentu.shield.v1alpha1.QueryPoolRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.shentu.shield.v1alpha1.QueryPoolRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.shentu.shield.v1alpha1.QueryPoolRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.shield.v1alpha1.QueryPoolRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
};


/**
 * optional uint64 pool_id = 1;
 * @return {number}
 */
proto.shentu.shield.v1alpha1.QueryPoolRequest.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.shentu.shield.v1alpha1.QueryPoolRequest} returns this
 */
proto.shentu.shield.v1alpha1.QueryPoolRequest.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


