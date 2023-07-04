// source: akash/deployment/v1beta1/query.proto
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

goog.provide('proto.akash.deployment.v1beta1.QueryDeploymentResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.akash.deployment.v1beta1.Deployment');
goog.require('proto.akash.deployment.v1beta1.Group');
goog.require('proto.akash.escrow.v1beta1.Account');

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
proto.akash.deployment.v1beta1.QueryDeploymentResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.akash.deployment.v1beta1.QueryDeploymentResponse.repeatedFields_, null);
};
goog.inherits(proto.akash.deployment.v1beta1.QueryDeploymentResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.deployment.v1beta1.QueryDeploymentResponse.displayName = 'proto.akash.deployment.v1beta1.QueryDeploymentResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.repeatedFields_ = [2];



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
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.deployment.v1beta1.QueryDeploymentResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.deployment.v1beta1.QueryDeploymentResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    deployment: (f = msg.getDeployment()) && proto.akash.deployment.v1beta1.Deployment.toObject(includeInstance, f),
    groupsList: jspb.Message.toObjectList(msg.getGroupsList(),
    proto.akash.deployment.v1beta1.Group.toObject, includeInstance),
    escrowAccount: (f = msg.getEscrowAccount()) && proto.akash.escrow.v1beta1.Account.toObject(includeInstance, f)
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
 * @return {!proto.akash.deployment.v1beta1.QueryDeploymentResponse}
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.deployment.v1beta1.QueryDeploymentResponse;
  return proto.akash.deployment.v1beta1.QueryDeploymentResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.deployment.v1beta1.QueryDeploymentResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.deployment.v1beta1.QueryDeploymentResponse}
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.akash.deployment.v1beta1.Deployment;
      reader.readMessage(value,proto.akash.deployment.v1beta1.Deployment.deserializeBinaryFromReader);
      msg.setDeployment(value);
      break;
    case 2:
      var value = new proto.akash.deployment.v1beta1.Group;
      reader.readMessage(value,proto.akash.deployment.v1beta1.Group.deserializeBinaryFromReader);
      msg.addGroups(value);
      break;
    case 3:
      var value = new proto.akash.escrow.v1beta1.Account;
      reader.readMessage(value,proto.akash.escrow.v1beta1.Account.deserializeBinaryFromReader);
      msg.setEscrowAccount(value);
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
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.deployment.v1beta1.QueryDeploymentResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.deployment.v1beta1.QueryDeploymentResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDeployment();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.akash.deployment.v1beta1.Deployment.serializeBinaryToWriter
    );
  }
  f = message.getGroupsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.akash.deployment.v1beta1.Group.serializeBinaryToWriter
    );
  }
  f = message.getEscrowAccount();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.akash.escrow.v1beta1.Account.serializeBinaryToWriter
    );
  }
};


/**
 * optional Deployment deployment = 1;
 * @return {?proto.akash.deployment.v1beta1.Deployment}
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.getDeployment = function() {
  return /** @type{?proto.akash.deployment.v1beta1.Deployment} */ (
    jspb.Message.getWrapperField(this, proto.akash.deployment.v1beta1.Deployment, 1));
};


/**
 * @param {?proto.akash.deployment.v1beta1.Deployment|undefined} value
 * @return {!proto.akash.deployment.v1beta1.QueryDeploymentResponse} returns this
*/
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.setDeployment = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.deployment.v1beta1.QueryDeploymentResponse} returns this
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.clearDeployment = function() {
  return this.setDeployment(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.hasDeployment = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Group groups = 2;
 * @return {!Array<!proto.akash.deployment.v1beta1.Group>}
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.getGroupsList = function() {
  return /** @type{!Array<!proto.akash.deployment.v1beta1.Group>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.akash.deployment.v1beta1.Group, 2));
};


/**
 * @param {!Array<!proto.akash.deployment.v1beta1.Group>} value
 * @return {!proto.akash.deployment.v1beta1.QueryDeploymentResponse} returns this
*/
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.setGroupsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.akash.deployment.v1beta1.Group=} opt_value
 * @param {number=} opt_index
 * @return {!proto.akash.deployment.v1beta1.Group}
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.addGroups = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.akash.deployment.v1beta1.Group, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.akash.deployment.v1beta1.QueryDeploymentResponse} returns this
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.clearGroupsList = function() {
  return this.setGroupsList([]);
};


/**
 * optional akash.escrow.v1beta1.Account escrow_account = 3;
 * @return {?proto.akash.escrow.v1beta1.Account}
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.getEscrowAccount = function() {
  return /** @type{?proto.akash.escrow.v1beta1.Account} */ (
    jspb.Message.getWrapperField(this, proto.akash.escrow.v1beta1.Account, 3));
};


/**
 * @param {?proto.akash.escrow.v1beta1.Account|undefined} value
 * @return {!proto.akash.deployment.v1beta1.QueryDeploymentResponse} returns this
*/
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.setEscrowAccount = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.deployment.v1beta1.QueryDeploymentResponse} returns this
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.clearEscrowAccount = function() {
  return this.setEscrowAccount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.deployment.v1beta1.QueryDeploymentResponse.prototype.hasEscrowAccount = function() {
  return jspb.Message.getField(this, 3) != null;
};

