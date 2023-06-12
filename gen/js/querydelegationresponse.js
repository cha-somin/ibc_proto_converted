// source: cosmos/staking/v1beta1/query.proto
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

goog.provide('proto.cosmos.staking.v1beta1.QueryDelegationResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.staking.v1beta1.DelegationResponse');

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
proto.cosmos.staking.v1beta1.QueryDelegationResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.staking.v1beta1.QueryDelegationResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.staking.v1beta1.QueryDelegationResponse.displayName = 'proto.cosmos.staking.v1beta1.QueryDelegationResponse';
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
proto.cosmos.staking.v1beta1.QueryDelegationResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.staking.v1beta1.QueryDelegationResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.staking.v1beta1.QueryDelegationResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.staking.v1beta1.QueryDelegationResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    delegationResponse: (f = msg.getDelegationResponse()) && proto.cosmos.staking.v1beta1.DelegationResponse.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.staking.v1beta1.QueryDelegationResponse}
 */
proto.cosmos.staking.v1beta1.QueryDelegationResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.staking.v1beta1.QueryDelegationResponse;
  return proto.cosmos.staking.v1beta1.QueryDelegationResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.staking.v1beta1.QueryDelegationResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.staking.v1beta1.QueryDelegationResponse}
 */
proto.cosmos.staking.v1beta1.QueryDelegationResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.staking.v1beta1.DelegationResponse;
      reader.readMessage(value,proto.cosmos.staking.v1beta1.DelegationResponse.deserializeBinaryFromReader);
      msg.setDelegationResponse(value);
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
proto.cosmos.staking.v1beta1.QueryDelegationResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.staking.v1beta1.QueryDelegationResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.staking.v1beta1.QueryDelegationResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.staking.v1beta1.QueryDelegationResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDelegationResponse();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.staking.v1beta1.DelegationResponse.serializeBinaryToWriter
    );
  }
};


/**
 * optional DelegationResponse delegation_response = 1;
 * @return {?proto.cosmos.staking.v1beta1.DelegationResponse}
 */
proto.cosmos.staking.v1beta1.QueryDelegationResponse.prototype.getDelegationResponse = function() {
  return /** @type{?proto.cosmos.staking.v1beta1.DelegationResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.staking.v1beta1.DelegationResponse, 1));
};


/**
 * @param {?proto.cosmos.staking.v1beta1.DelegationResponse|undefined} value
 * @return {!proto.cosmos.staking.v1beta1.QueryDelegationResponse} returns this
*/
proto.cosmos.staking.v1beta1.QueryDelegationResponse.prototype.setDelegationResponse = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.staking.v1beta1.QueryDelegationResponse} returns this
 */
proto.cosmos.staking.v1beta1.QueryDelegationResponse.prototype.clearDelegationResponse = function() {
  return this.setDelegationResponse(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.staking.v1beta1.QueryDelegationResponse.prototype.hasDelegationResponse = function() {
  return jspb.Message.getField(this, 1) != null;
};


