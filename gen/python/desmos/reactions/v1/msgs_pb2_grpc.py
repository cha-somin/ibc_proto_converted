# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from desmos.reactions.v1 import msgs_pb2 as desmos_dot_reactions_dot_v1_dot_msgs__pb2


class MsgStub(object):
    """Msg defines the reactions Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.AddReaction = channel.unary_unary(
                '/desmos.reactions.v1.Msg/AddReaction',
                request_serializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgAddReaction.SerializeToString,
                response_deserializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgAddReactionResponse.FromString,
                )
        self.RemoveReaction = channel.unary_unary(
                '/desmos.reactions.v1.Msg/RemoveReaction',
                request_serializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgRemoveReaction.SerializeToString,
                response_deserializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgRemoveReactionResponse.FromString,
                )
        self.AddRegisteredReaction = channel.unary_unary(
                '/desmos.reactions.v1.Msg/AddRegisteredReaction',
                request_serializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgAddRegisteredReaction.SerializeToString,
                response_deserializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgAddRegisteredReactionResponse.FromString,
                )
        self.EditRegisteredReaction = channel.unary_unary(
                '/desmos.reactions.v1.Msg/EditRegisteredReaction',
                request_serializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgEditRegisteredReaction.SerializeToString,
                response_deserializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgEditRegisteredReactionResponse.FromString,
                )
        self.RemoveRegisteredReaction = channel.unary_unary(
                '/desmos.reactions.v1.Msg/RemoveRegisteredReaction',
                request_serializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgRemoveRegisteredReaction.SerializeToString,
                response_deserializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgRemoveRegisteredReactionResponse.FromString,
                )
        self.SetReactionsParams = channel.unary_unary(
                '/desmos.reactions.v1.Msg/SetReactionsParams',
                request_serializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgSetReactionsParams.SerializeToString,
                response_deserializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgSetReactionsParamsResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the reactions Msg service.
    """

    def AddReaction(self, request, context):
        """AddReaction allows to add a post reaction
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RemoveReaction(self, request, context):
        """RemoveReaction allows to remove an existing post reaction
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AddRegisteredReaction(self, request, context):
        """AddRegisteredReaction allows to registered a new supported reaction
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def EditRegisteredReaction(self, request, context):
        """EditRegisteredReaction allows to edit a registered reaction
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RemoveRegisteredReaction(self, request, context):
        """RemoveRegisteredReaction allows to remove an existing supported reaction
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetReactionsParams(self, request, context):
        """SetReactionsParams allows to set the reactions params
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'AddReaction': grpc.unary_unary_rpc_method_handler(
                    servicer.AddReaction,
                    request_deserializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgAddReaction.FromString,
                    response_serializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgAddReactionResponse.SerializeToString,
            ),
            'RemoveReaction': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveReaction,
                    request_deserializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgRemoveReaction.FromString,
                    response_serializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgRemoveReactionResponse.SerializeToString,
            ),
            'AddRegisteredReaction': grpc.unary_unary_rpc_method_handler(
                    servicer.AddRegisteredReaction,
                    request_deserializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgAddRegisteredReaction.FromString,
                    response_serializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgAddRegisteredReactionResponse.SerializeToString,
            ),
            'EditRegisteredReaction': grpc.unary_unary_rpc_method_handler(
                    servicer.EditRegisteredReaction,
                    request_deserializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgEditRegisteredReaction.FromString,
                    response_serializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgEditRegisteredReactionResponse.SerializeToString,
            ),
            'RemoveRegisteredReaction': grpc.unary_unary_rpc_method_handler(
                    servicer.RemoveRegisteredReaction,
                    request_deserializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgRemoveRegisteredReaction.FromString,
                    response_serializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgRemoveRegisteredReactionResponse.SerializeToString,
            ),
            'SetReactionsParams': grpc.unary_unary_rpc_method_handler(
                    servicer.SetReactionsParams,
                    request_deserializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgSetReactionsParams.FromString,
                    response_serializer=desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgSetReactionsParamsResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'desmos.reactions.v1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the reactions Msg service.
    """

    @staticmethod
    def AddReaction(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.reactions.v1.Msg/AddReaction',
            desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgAddReaction.SerializeToString,
            desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgAddReactionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RemoveReaction(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.reactions.v1.Msg/RemoveReaction',
            desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgRemoveReaction.SerializeToString,
            desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgRemoveReactionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AddRegisteredReaction(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.reactions.v1.Msg/AddRegisteredReaction',
            desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgAddRegisteredReaction.SerializeToString,
            desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgAddRegisteredReactionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def EditRegisteredReaction(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.reactions.v1.Msg/EditRegisteredReaction',
            desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgEditRegisteredReaction.SerializeToString,
            desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgEditRegisteredReactionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RemoveRegisteredReaction(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.reactions.v1.Msg/RemoveRegisteredReaction',
            desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgRemoveRegisteredReaction.SerializeToString,
            desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgRemoveRegisteredReactionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetReactionsParams(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/desmos.reactions.v1.Msg/SetReactionsParams',
            desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgSetReactionsParams.SerializeToString,
            desmos_dot_reactions_dot_v1_dot_msgs__pb2.MsgSetReactionsParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)