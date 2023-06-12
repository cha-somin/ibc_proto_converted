// source: confio/poe/v1beta1/genesis.proto
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

goog.provide('proto.confio.poe.v1beta1.CommunityPoolContractConfig');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.confio.poe.v1beta1.VotingRules');

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
proto.confio.poe.v1beta1.CommunityPoolContractConfig = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.confio.poe.v1beta1.CommunityPoolContractConfig, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.confio.poe.v1beta1.CommunityPoolContractConfig.displayName = 'proto.confio.poe.v1beta1.CommunityPoolContractConfig';
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
proto.confio.poe.v1beta1.CommunityPoolContractConfig.prototype.toObject = function(opt_includeInstance) {
  return proto.confio.poe.v1beta1.CommunityPoolContractConfig.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.confio.poe.v1beta1.CommunityPoolContractConfig} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.confio.poe.v1beta1.CommunityPoolContractConfig.toObject = function(includeInstance, msg) {
  var f, obj = {
    votingRules: (f = msg.getVotingRules()) && proto.confio.poe.v1beta1.VotingRules.toObject(includeInstance, f)
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
 * @return {!proto.confio.poe.v1beta1.CommunityPoolContractConfig}
 */
proto.confio.poe.v1beta1.CommunityPoolContractConfig.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.confio.poe.v1beta1.CommunityPoolContractConfig;
  return proto.confio.poe.v1beta1.CommunityPoolContractConfig.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.confio.poe.v1beta1.CommunityPoolContractConfig} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.confio.poe.v1beta1.CommunityPoolContractConfig}
 */
proto.confio.poe.v1beta1.CommunityPoolContractConfig.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.confio.poe.v1beta1.VotingRules;
      reader.readMessage(value,proto.confio.poe.v1beta1.VotingRules.deserializeBinaryFromReader);
      msg.setVotingRules(value);
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
proto.confio.poe.v1beta1.CommunityPoolContractConfig.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.confio.poe.v1beta1.CommunityPoolContractConfig.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.confio.poe.v1beta1.CommunityPoolContractConfig} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.confio.poe.v1beta1.CommunityPoolContractConfig.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getVotingRules();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.confio.poe.v1beta1.VotingRules.serializeBinaryToWriter
    );
  }
};


/**
 * optional VotingRules voting_rules = 1;
 * @return {?proto.confio.poe.v1beta1.VotingRules}
 */
proto.confio.poe.v1beta1.CommunityPoolContractConfig.prototype.getVotingRules = function() {
  return /** @type{?proto.confio.poe.v1beta1.VotingRules} */ (
    jspb.Message.getWrapperField(this, proto.confio.poe.v1beta1.VotingRules, 1));
};


/**
 * @param {?proto.confio.poe.v1beta1.VotingRules|undefined} value
 * @return {!proto.confio.poe.v1beta1.CommunityPoolContractConfig} returns this
*/
proto.confio.poe.v1beta1.CommunityPoolContractConfig.prototype.setVotingRules = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.CommunityPoolContractConfig} returns this
 */
proto.confio.poe.v1beta1.CommunityPoolContractConfig.prototype.clearVotingRules = function() {
  return this.setVotingRules(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.CommunityPoolContractConfig.prototype.hasVotingRules = function() {
  return jspb.Message.getField(this, 1) != null;
};


