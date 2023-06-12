# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from assetmantle.maintainers.queries.maintainer import query_request_pb2 as assetmantle_dot_maintainers_dot_queries_dot_maintainer_dot_query__request__pb2
from assetmantle.maintainers.queries.maintainer import query_response_pb2 as assetmantle_dot_maintainers_dot_queries_dot_maintainer_dot_query__response__pb2


class ServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Handle = channel.unary_unary(
                '/assetmantle.modules.maintainers.queries.maintainer.Service/Handle',
                request_serializer=assetmantle_dot_maintainers_dot_queries_dot_maintainer_dot_query__request__pb2.QueryRequest.SerializeToString,
                response_deserializer=assetmantle_dot_maintainers_dot_queries_dot_maintainer_dot_query__response__pb2.QueryResponse.FromString,
                )


class ServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Handle(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_ServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Handle': grpc.unary_unary_rpc_method_handler(
                    servicer.Handle,
                    request_deserializer=assetmantle_dot_maintainers_dot_queries_dot_maintainer_dot_query__request__pb2.QueryRequest.FromString,
                    response_serializer=assetmantle_dot_maintainers_dot_queries_dot_maintainer_dot_query__response__pb2.QueryResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'assetmantle.modules.maintainers.queries.maintainer.Service', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Service(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def Handle(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/assetmantle.modules.maintainers.queries.maintainer.Service/Handle',
            assetmantle_dot_maintainers_dot_queries_dot_maintainer_dot_query__request__pb2.QueryRequest.SerializeToString,
            assetmantle_dot_maintainers_dot_queries_dot_maintainer_dot_query__response__pb2.QueryResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
