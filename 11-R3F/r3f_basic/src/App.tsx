import "./App.css";
import { Canvas } from "@react-three/fiber";
import { ThreeElement } from "./ThreeElement";
import { OrbitControls } from "@react-three/drei";
import { useControls } from "leva";

function App() {
  const color = useControls({
    value: "white",
  });

  const grid = useControls({
    segment: { value: 10, min: 2, max: 100, step: 1 },
  });
  return (
    <>
      <Canvas
        // orthographic
        camera={{
          // zoom: 150,
          near: 1,
          far: 100,
          fov: 75,
          position: [5, 5, 5],
        }}
      >
        <color attach="background" args={[color.value]} />
        <OrbitControls
          minAzimuthAngle={-Math.PI / 4}
          maxAzimuthAngle={Math.PI / 4}
          minPolarAngle={Math.PI / 6}
          maxPolarAngle={Math.PI - Math.PI / 6}
        />
        <ThreeElement />
        <axesHelper args={[5]} />
        <gridHelper args={[10, grid.segment]} />
      </Canvas>
    </>
  );
}

export default App;
