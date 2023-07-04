// source: coreum/customparams/v1/query.proto
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

goog.provide('proto.coreum.customparams.v1.QueryStakingParamsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.coreum.customparams.v1.StakingParams');

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
proto.coreum.customparams.v1.QueryStakingParamsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.coreum.customparams.v1.QueryStakingParamsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.coreum.customparams.v1.QueryStakingParamsResponse.displayName = 'proto.coreum.customparams.v1.QueryStakingParamsResponse';
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
proto.coreum.customparams.v1.QueryStakingParamsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.coreum.customparams.v1.QueryStakingParamsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.coreum.customparams.v1.QueryStakingParamsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.customparams.v1.QueryStakingParamsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.coreum.customparams.v1.StakingParams.toObject(includeInstance, f)
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
 * @return {!proto.coreum.customparams.v1.QueryStakingParamsResponse}
 */
proto.coreum.customparams.v1.QueryStakingParamsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.coreum.customparams.v1.QueryStakingParamsResponse;
  return proto.coreum.customparams.v1.QueryStakingParamsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.coreum.customparams.v1.QueryStakingParamsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.coreum.customparams.v1.QueryStakingParamsResponse}
 */
proto.coreum.customparams.v1.QueryStakingParamsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.coreum.customparams.v1.StakingParams;
      reader.readMessage(value,proto.coreum.customparams.v1.StakingParams.deserializeBinaryFromReader);
      msg.setParams(value);
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
proto.coreum.customparams.v1.QueryStakingParamsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.coreum.customparams.v1.QueryStakingParamsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.coreum.customparams.v1.QueryStakingParamsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.customparams.v1.QueryStakingParamsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.coreum.customparams.v1.StakingParams.serializeBinaryToWriter
    );
  }
};


/**
 * optional StakingParams params = 1;
 * @return {?proto.coreum.customparams.v1.StakingParams}
 */
proto.coreum.customparams.v1.QueryStakingParamsResponse.prototype.getParams = function() {
  return /** @type{?proto.coreum.customparams.v1.StakingParams} */ (
    jspb.Message.getWrapperField(this, proto.coreum.customparams.v1.StakingParams, 1));
};


/**
 * @param {?proto.coreum.customparams.v1.StakingParams|undefined} value
 * @return {!proto.coreum.customparams.v1.QueryStakingParamsResponse} returns this
*/
proto.coreum.customparams.v1.QueryStakingParamsResponse.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.coreum.customparams.v1.QueryStakingParamsResponse} returns this
 */
proto.coreum.customparams.v1.QueryStakingParamsResponse.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.coreum.customparams.v1.QueryStakingParamsResponse.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};

