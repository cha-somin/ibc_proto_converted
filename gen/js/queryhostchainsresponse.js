// source: pstake/liquidstakeibc/v1beta1/query.proto
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

goog.provide('proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.pstake.liquidstakeibc.v1beta1.HostChain');

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
proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.repeatedFields_, null);
};
goog.inherits(proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.displayName = 'proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.repeatedFields_ = [1];



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
proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    hostChainsList: jspb.Message.toObjectList(msg.getHostChainsList(),
    proto.pstake.liquidstakeibc.v1beta1.HostChain.toObject, includeInstance)
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
 * @return {!proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse}
 */
proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse;
  return proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse}
 */
proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.pstake.liquidstakeibc.v1beta1.HostChain;
      reader.readMessage(value,proto.pstake.liquidstakeibc.v1beta1.HostChain.deserializeBinaryFromReader);
      msg.addHostChains(value);
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
proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getHostChainsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.pstake.liquidstakeibc.v1beta1.HostChain.serializeBinaryToWriter
    );
  }
};


/**
 * repeated HostChain host_chains = 1;
 * @return {!Array<!proto.pstake.liquidstakeibc.v1beta1.HostChain>}
 */
proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.prototype.getHostChainsList = function() {
  return /** @type{!Array<!proto.pstake.liquidstakeibc.v1beta1.HostChain>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.pstake.liquidstakeibc.v1beta1.HostChain, 1));
};


/**
 * @param {!Array<!proto.pstake.liquidstakeibc.v1beta1.HostChain>} value
 * @return {!proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse} returns this
*/
proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.prototype.setHostChainsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.pstake.liquidstakeibc.v1beta1.HostChain=} opt_value
 * @param {number=} opt_index
 * @return {!proto.pstake.liquidstakeibc.v1beta1.HostChain}
 */
proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.prototype.addHostChains = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.pstake.liquidstakeibc.v1beta1.HostChain, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse} returns this
 */
proto.pstake.liquidstakeibc.v1beta1.QueryHostChainsResponse.prototype.clearHostChainsList = function() {
  return this.setHostChainsList([]);
};


