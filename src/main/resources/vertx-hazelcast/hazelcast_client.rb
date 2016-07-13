require 'vertx-hazelcast/i_map'
require 'vertx/vertx'
require 'vertx-hazelcast/distributed_object'
require 'vertx-hazelcast/i_atomic_long'
require 'vertx/util/utils.rb'
# Generated from io.vertx.hazelcast.HazelcastClient
module VertxHazelcast
  # 
  class HazelcastClient
    # @private
    # @param j_del [::VertxHazelcast::HazelcastClient] the java delegate
    def initialize(j_del)
      @j_del = j_del
    end
    # @private
    # @return [::VertxHazelcast::HazelcastClient] the underlying java delegate
    def j_del
      @j_del
    end
    # @param [::Vertx::Vertx] vertx 
    # @return [::VertxHazelcast::HazelcastClient]
    def self.create(vertx=nil)
      if vertx.class.method_defined?(:j_del) && !block_given?
        return ::Vertx::Util::Utils.safe_create(Java::IoVertxHazelcast::HazelcastClient.java_method(:create, [Java::IoVertxCore::Vertx.java_class]).call(vertx.j_del),::VertxHazelcast::HazelcastClient)
      end
      raise ArgumentError, "Invalid arguments when calling create(vertx)"
    end
    # @param [String] serviceName 
    # @param [String] distributedObjectName 
    # @yield 
    # @return [self]
    def get_distributed_object(serviceName=nil,distributedObjectName=nil)
      if serviceName.class == String && distributedObjectName.class == String && block_given?
        @j_del.java_method(:getDistributedObject, [Java::java.lang.String.java_class,Java::java.lang.String.java_class,Java::IoVertxCore::Handler.java_class]).call(serviceName,distributedObjectName,(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.safe_create(ar.result,::VertxHazelcast::DistributedObject) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_distributed_object(serviceName,distributedObjectName)"
    end
    # @param [String] name 
    # @yield 
    # @return [self]
    def get_map(name=nil)
      if name.class == String && block_given?
        @j_del.java_method(:getMap, [Java::java.lang.String.java_class,Java::IoVertxCore::Handler.java_class]).call(name,(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.safe_create(ar.result,::VertxHazelcast::IMap) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_map(name)"
    end
    # @param [String] name 
    # @yield 
    # @return [self]
    def get_atomic_long(name=nil)
      if name.class == String && block_given?
        @j_del.java_method(:getAtomicLong, [Java::java.lang.String.java_class,Java::IoVertxCore::Handler.java_class]).call(name,(Proc.new { |ar| yield(ar.failed ? ar.cause : nil, ar.succeeded ? ::Vertx::Util::Utils.safe_create(ar.result,::VertxHazelcast::IAtomicLong) : nil) }))
        return self
      end
      raise ArgumentError, "Invalid arguments when calling get_atomic_long(name)"
    end
  end
end
