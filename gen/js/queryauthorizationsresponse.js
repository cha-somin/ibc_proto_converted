// source: stargaze/globalfee/v1/query.proto
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

goog.provide('proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization');
goog.require('proto.publicawesome.stargaze.globalfee.v1.ContractAuthorization');

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
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.repeatedFields_, null);
};
goog.inherits(proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.displayName = 'proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.repeatedFields_ = [1,2];



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
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    codeAuthorizationsList: jspb.Message.toObjectList(msg.getCodeAuthorizationsList(),
    proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization.toObject, includeInstance),
    contractAuthorizationsList: jspb.Message.toObjectList(msg.getContractAuthorizationsList(),
    proto.publicawesome.stargaze.globalfee.v1.ContractAuthorization.toObject, includeInstance)
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
 * @return {!proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse}
 */
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse;
  return proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse}
 */
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization;
      reader.readMessage(value,proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization.deserializeBinaryFromReader);
      msg.addCodeAuthorizations(value);
      break;
    case 2:
      var value = new proto.publicawesome.stargaze.globalfee.v1.ContractAuthorization;
      reader.readMessage(value,proto.publicawesome.stargaze.globalfee.v1.ContractAuthorization.deserializeBinaryFromReader);
      msg.addContractAuthorizations(value);
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
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCodeAuthorizationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization.serializeBinaryToWriter
    );
  }
  f = message.getContractAuthorizationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.publicawesome.stargaze.globalfee.v1.ContractAuthorization.serializeBinaryToWriter
    );
  }
};


/**
 * repeated CodeAuthorization code_authorizations = 1;
 * @return {!Array<!proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization>}
 */
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.prototype.getCodeAuthorizationsList = function() {
  return /** @type{!Array<!proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization, 1));
};


/**
 * @param {!Array<!proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization>} value
 * @return {!proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse} returns this
*/
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.prototype.setCodeAuthorizationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization=} opt_value
 * @param {number=} opt_index
 * @return {!proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization}
 */
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.prototype.addCodeAuthorizations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse} returns this
 */
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.prototype.clearCodeAuthorizationsList = function() {
  return this.setCodeAuthorizationsList([]);
};


/**
 * repeated ContractAuthorization contract_authorizations = 2;
 * @return {!Array<!proto.publicawesome.stargaze.globalfee.v1.ContractAuthorization>}
 */
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.prototype.getContractAuthorizationsList = function() {
  return /** @type{!Array<!proto.publicawesome.stargaze.globalfee.v1.ContractAuthorization>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.publicawesome.stargaze.globalfee.v1.ContractAuthorization, 2));
};


/**
 * @param {!Array<!proto.publicawesome.stargaze.globalfee.v1.ContractAuthorization>} value
 * @return {!proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse} returns this
*/
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.prototype.setContractAuthorizationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.publicawesome.stargaze.globalfee.v1.ContractAuthorization=} opt_value
 * @param {number=} opt_index
 * @return {!proto.publicawesome.stargaze.globalfee.v1.ContractAuthorization}
 */
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.prototype.addContractAuthorizations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.publicawesome.stargaze.globalfee.v1.ContractAuthorization, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse} returns this
 */
proto.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.prototype.clearContractAuthorizationsList = function() {
  return this.setContractAuthorizationsList([]);
};

